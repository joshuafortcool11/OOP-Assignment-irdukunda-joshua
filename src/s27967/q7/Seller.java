package s27967.q7;

public class Seller extends Property {
    private final String sellerName;
    private final String contactNumber;

    public Seller(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price);
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;

        if (sellerName == null || sellerName.trim().isEmpty()) addValidationError("sellerName must not be empty");
        if (contactNumber == null || contactNumber.trim().isEmpty()) addValidationError("seller contactNumber must not be empty");
    }

    public String getSellerName() { return sellerName; }
    public String getContactNumber() { return contactNumber; }
}
