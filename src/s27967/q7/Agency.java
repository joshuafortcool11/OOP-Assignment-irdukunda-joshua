package s27967.q7;

public class Agency extends Entity {
    private final String agencyName;
    private final String location;
    private final String phoneNumber;

    public Agency(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) addValidationError("phoneNumber must be 10 digits");
    }

    public String getAgencyName() { return agencyName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}
