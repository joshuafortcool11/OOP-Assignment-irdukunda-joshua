package s27967.q9;

public class Flight extends Airline {
    private final String flightNumber;
    private final String destination;
    private final String departureTime;

    public Flight(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;

        if (flightNumber == null || flightNumber.trim().isEmpty()) addValidationError("flightNumber must not be empty");
        if (destination == null || destination.trim().isEmpty()) addValidationError("destination must not be empty");
        if (departureTime == null || departureTime.trim().isEmpty()) addValidationError("departureTime must not be empty");
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}
