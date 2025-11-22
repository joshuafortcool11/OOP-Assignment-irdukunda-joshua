package s27967.q9;

public class Passenger extends Flight {
    private final String passengerName;
    private final String passportNumber;
    private final String nationality;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;

        if (passportNumber == null || passportNumber.trim().isEmpty()) addValidationError("passportNumber must not be empty");
    }

    public String getPassengerName() { return passengerName; }
    public String getPassportNumber() { return passportNumber; }
    public String getNationality() { return nationality; }
}
