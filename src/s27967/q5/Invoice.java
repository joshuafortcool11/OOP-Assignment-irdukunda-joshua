package s27967.q5;

public class Invoice extends Payment {
    private double totalCharge;

    public Invoice(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId,
                   double totalCharge) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
        this.totalCharge = totalCharge;
        if (totalCharge <= 0) addValidationError("totalCharge must be > 0");
    }

    public double getTotalCharge() { return totalCharge; }
    protected void setTotalCharge(double total) { this.totalCharge = total; }
}
