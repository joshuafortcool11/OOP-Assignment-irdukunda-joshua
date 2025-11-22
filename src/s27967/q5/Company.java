package s27967.q5;

public class Company extends Entity {
    private final String companyName;
    private final String address;
    private final String phoneNumber;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            addValidationError("phone number must be 10 digits");
        }
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}
