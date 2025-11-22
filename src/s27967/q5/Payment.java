package s27967.q5;

public class Payment extends Charge {
    private final String paymentMode;
    private final String transactionId;

    public Payment(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;

        if (paymentMode == null || paymentMode.trim().isEmpty()) addValidationError("paymentMode must not be empty");
        if (transactionId == null || transactionId.trim().isEmpty()) addValidationError("transactionId must not be empty");
    }

    public String getPaymentMode() { return paymentMode; }
    public String getTransactionId() { return transactionId; }
}
