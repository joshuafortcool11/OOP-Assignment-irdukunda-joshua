package s27967.q9;

public class Baggage extends Ticket {
    private final double baggageWeight;
    private final double baggageFee;

    public Baggage(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price);
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;

        if (baggageFee < 0) addValidationError("baggageFee must be >= 0");
    }

    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }
}
