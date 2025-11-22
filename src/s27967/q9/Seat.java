package s27967.q9;

public class Seat extends Passenger {
    private final String seatNumber;
    private final String seatType; // Economy or Business

    public Seat(int id, String createdDate, String updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        this.seatNumber = seatNumber;
        this.seatType = seatType;

        if (seatType == null || !(seatType.equals("Economy") || seatType.equals("Business"))) addValidationError("seatType must be \"Economy\" or \"Business\"");
    }

    public String getSeatNumber() { return seatNumber; }
    public String getSeatType() { return seatType; }
}
