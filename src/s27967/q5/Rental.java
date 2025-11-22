package s27967.q5;

public class Rental extends Customer {
    private final String rentalDate;
    private final String returnDate;
    private final int rentalDays;

    public Rental(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber);
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;

        if (rentalDays <= 0) addValidationError("rentalDays must be > 0");
    }

    public String getRentalDate() { return rentalDate; }
    public String getReturnDate() { return returnDate; }
    public int getRentalDays() { return rentalDays; }
}
