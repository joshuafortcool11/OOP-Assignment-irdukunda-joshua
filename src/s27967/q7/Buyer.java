package s27967.q7;

public class Buyer extends Seller {
    private final String buyerName;
    private final String email;

    public Buyer(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String emailAgent, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String email) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
        this.buyerName = buyerName;
        this.email = email;

        if (buyerName == null || buyerName.trim().isEmpty()) addValidationError("buyerName must not be empty");
        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) addValidationError("buyer email format invalid");
    }

    public String getBuyerName() { return buyerName; }
    public String getBuyerEmail() { return email; }
}
