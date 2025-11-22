package s27967.q5;

public class MainQ5 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        int id = 1;
        String createdDate = "2025-11-22";
        String updatedDate = "2025-11-22";
        String companyName = "Rentals Co";
        String companyAddress = "456 Rent Rd";
        String companyPhone = "0123456789";
        String branchName = "Central Branch";
        String locationCode = "BR01";
        String vehicleType = "Car";
        String registrationNumber = "ABC123";
        double dailyRate = 50.0;
        String customerName = "Customer One";
        String licenseNumber = "LIC123";
        String contactNumber = "0716666666";
        String rentalDate = "2025-11-10";
        String returnDate = "2025-11-15";
        int rentalDays = 5;
        double rentalCharge = 250.0;
        double penaltyCharge = 0.0;
        String paymentMode = "Cash";
        String transactionId = "TXN123";

        double totalCharge = rentalCharge + penaltyCharge;

        RentalRecord r = new RentalRecord(id, createdDate, updatedDate,
                companyName, companyAddress, companyPhone,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays,
                rentalCharge, penaltyCharge,
                paymentMode, transactionId,
                totalCharge);

        if (!r.isValid()) {
            System.out.println(ID + " Validation errors:");
            for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
            return;
        }

        double total = r.calculateTotalCharge();
        System.out.println(ID + " --- Rental Record ---");
        System.out.print(r.getDetails());
        System.out.println(ID + " Total Charge: " + total);
    }
}
