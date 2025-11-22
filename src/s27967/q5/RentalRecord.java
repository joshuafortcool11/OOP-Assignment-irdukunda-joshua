package s27967.q5;

public final class RentalRecord extends Invoice {

    public RentalRecord(int id, String createdDate, String updatedDate,
                        String companyName, String address, String phoneNumber,
                        String branchName, String locationCode,
                        String vehicleType, String registrationNumber, double dailyRate,
                        String customerName, String licenseNumber, String contactNumber,
                        String rentalDate, String returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId,
                        double totalCharge) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId, totalCharge);
    }

    public double calculateTotalCharge() {
        double total = getRentalCharge() + getPenaltyCharge();
        setTotalCharge(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company: ").append(getCompanyName()).append("\n");
        sb.append("Branch: ").append(getBranchName()).append(" | LocationCode: ").append(getLocationCode()).append("\n");
        sb.append("Vehicle: ").append(getVehicleType()).append(" | Reg: ").append(getRegistrationNumber()).append(" | Rate/day: ").append(getDailyRate()).append("\n");
        sb.append("Customer: ").append(getCustomerName()).append(" | License: ").append(getLicenseNumber()).append(" | Contact: ").append(getContactNumber()).append("\n");
        sb.append("Rental: start=").append(getRentalDate()).append(" | end=").append(getReturnDate()).append(" | days=").append(getRentalDays()).append("\n");
        sb.append("Charges: rental=").append(getRentalCharge()).append(" | penalty=").append(getPenaltyCharge()).append(" | total=").append(getTotalCharge()).append("\n");
        sb.append("Payment: mode=").append(getPaymentMode()).append(" | txId=").append(getTransactionId()).append("\n");
        return sb.toString();
    }
}
