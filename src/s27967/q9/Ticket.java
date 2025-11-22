package s27967.q9;

public class Ticket extends Seat {
    private final String ticketNumber;
    private final double price;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType);
        this.ticketNumber = ticketNumber;
        this.price = price;

        if (price <= 0) addValidationError("price must be > 0");
    }

    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }
}
