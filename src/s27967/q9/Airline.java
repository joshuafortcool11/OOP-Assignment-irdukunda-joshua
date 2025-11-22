package s27967.q9;

public class Airline extends Entity {
    private final String airlineName;
    private final String address;
    private final String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;

        if (contactEmail == null || !contactEmail.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) addValidationError("contactEmail format invalid");
    }

    public String getAirlineName() { return airlineName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}
