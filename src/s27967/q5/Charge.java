package s27967.q5;

public class Charge extends Rental {
    private final double rentalCharge;
    private final double penaltyCharge;

    public Charge(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays);
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;

        if (rentalCharge <= 0) addValidationError("rentalCharge must be > 0");
        if (penaltyCharge < 0) addValidationError("penaltyCharge must be >= 0");
    }

    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
}
