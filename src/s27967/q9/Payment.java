package s27967.q9;

public class Payment extends Baggage {
    private final String paymentDate;
    private final String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;

        if (paymentDate == null || paymentDate.trim().isEmpty()) addValidationError("paymentDate must not be empty");
        if (paymentMode == null || paymentMode.trim().isEmpty()) addValidationError("paymentMode must not be empty");
    }

    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}
