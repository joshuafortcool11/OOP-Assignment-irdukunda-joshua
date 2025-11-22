package s27967.q8;

public class Library extends Entity {
    private final String libraryName;
    private final String location;
    private final String phoneNumber;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber) {
        super(id, createdDate, updatedDate);
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) addValidationError("phoneNumber must be 10 digits");
    }

    public String getLibraryName() { return libraryName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}
