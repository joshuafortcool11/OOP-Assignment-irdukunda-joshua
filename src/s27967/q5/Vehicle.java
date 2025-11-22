package s27967.q5;

public class Vehicle extends Branch {
    private final String vehicleType;
    private final String registrationNumber;
    private final double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;

        if (dailyRate <= 0) addValidationError("dailyRate must be > 0");
    }

    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }
}
