package s27967.q7;

public class Payment extends Agreement {
    private final double paymentAmount;
    private final String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String emailAgent, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String buyerEmail,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms);
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;

        if (paymentAmount <= 0) addValidationError("paymentAmount must be > 0");
    }

    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate() { return paymentDate; }
}
