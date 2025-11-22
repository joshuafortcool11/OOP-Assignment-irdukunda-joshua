package s27967.q7;

public class Agreement extends Buyer {
    private final String agreementDate;
    private final String terms;

    public Agreement(int id, String createdDate, String updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String emailAgent, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String buyerEmail,
                     String agreementDate, String terms) {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail);
        this.agreementDate = agreementDate;
        this.terms = terms;

        if (terms == null || terms.trim().isEmpty()) addValidationError("agreement terms must not be empty");
    }

    public String getAgreementDate() { return agreementDate; }
    public String getTerms() { return terms; }
}
