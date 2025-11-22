package s27967.q9;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode,
                   double totalFare) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
        this.totalFare = totalFare;
        if (totalFare <= 0) addValidationError("totalFare must be > 0");
    }

    public double getTotalFare() { return totalFare; }
    protected void setTotalFare(double v) { this.totalFare = v; }
}
