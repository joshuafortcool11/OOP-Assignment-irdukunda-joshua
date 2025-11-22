package s27967.q7;

public class Commission extends Payment {
    private final double commissionRate; // percent
    private double commissionAmount;

    public Commission(int id, String createdDate, String updatedDate,
                      String agencyName, String location, String phoneNumber,
                      String agentName, String emailAgent, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String contactNumber,
                      String buyerName, String buyerEmail,
                      String agreementDate, String terms,
                      double paymentAmount, String paymentDate,
                      double commissionRate, double commissionAmount) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate);
        this.commissionRate = commissionRate;
        this.commissionAmount = commissionAmount;

        if (commissionRate < 0) addValidationError("commissionRate must be >= 0");
    }

    public double getCommissionRate() { return commissionRate; }
    public double getCommissionAmount() { return commissionAmount; }
    protected void setCommissionAmount(double amt) { this.commissionAmount = amt; }
}
