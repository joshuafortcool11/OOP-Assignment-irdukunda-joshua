package s27967.q7;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, String createdDate, String updatedDate,
                            String agencyName, String location, String phoneNumber,
                            String agentName, String emailAgent, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String contactNumber,
                            String buyerName, String buyerEmail,
                            String agreementDate, String terms,
                            double paymentAmount, String paymentDate,
                            double commissionRate, double commissionAmount) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate, commissionRate, commissionAmount);
    }

    public double calculateCommission() {
        double price = getPrice();
        double total = price * getCommissionRate() / 100.0;
        setCommissionAmount(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agency: ").append(getAgencyName()).append(" | Location: ").append(getLocation()).append("\n");
        sb.append("Agent: ").append(getAgentName()).append(" | Email: ").append(getEmail()).append(" | License: ").append(getLicenseNumber()).append("\n");
        sb.append("Property: code=").append(getPropertyCode()).append(" | type=").append(getPropertyType()).append(" | price=").append(getPrice()).append("\n");
        sb.append("Seller: ").append(getSellerName()).append(" | contact=").append(getContactNumber()).append("\n");
        sb.append("Buyer: ").append(getBuyerName()).append(" | email=").append(getBuyerEmail()).append("\n");
        sb.append("Agreement: date=").append(getAgreementDate()).append(" | terms=").append(getTerms()).append("\n");
        sb.append("Payment: amount=").append(getPaymentAmount()).append(" | date=").append(getPaymentDate()).append("\n");
        sb.append("Commission: rate=").append(getCommissionRate()).append(" | amount=").append(getCommissionAmount()).append("\n");
        return sb.toString();
    }
}
