package s27967.q5;

public class Customer extends Vehicle {
    private final String customerName;
    private final String licenseNumber;
    private final String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate);
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;

        if (licenseNumber == null || licenseNumber.trim().isEmpty()) addValidationError("licenseNumber must not be empty");
    }

    public String getCustomerName() { return customerName; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getContactNumber() { return contactNumber; }
}
