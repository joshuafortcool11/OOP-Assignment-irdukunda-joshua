package s27967.q9;

public final class TicketRecord extends Invoice {

    public TicketRecord(int id, String createdDate, String updatedDate,
                        String airlineName, String address, String contactEmail,
                        String flightNumber, String destination, String departureTime,
                        String passengerName, String passportNumber, String nationality,
                        String seatNumber, String seatType,
                        String ticketNumber, double price,
                        double baggageWeight, double baggageFee,
                        String paymentDate, String paymentMode,
                        double totalFare) {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode, totalFare);
    }

    public double generateInvoice() {
        double total = getPrice() + getBaggageFee();
        setTotalFare(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airline: ").append(getAirlineName()).append(" | Contact: ").append(getContactEmail()).append("\n");
        sb.append("Flight: ").append(getFlightNumber()).append(" -> ").append(getDestination()).append(" | Departs: ").append(getDepartureTime()).append("\n");
        sb.append("Passenger: ").append(getPassengerName()).append(" | Passport: ").append(getPassportNumber()).append(" | Nationality: ").append(getNationality()).append("\n");
        sb.append("Seat: ").append(getSeatNumber()).append(" | Type: ").append(getSeatType()).append("\n");
        sb.append("Ticket: ").append(getTicketNumber()).append(" | Price: ").append(getPrice()).append("\n");
        sb.append("Baggage: weight=").append(getBaggageWeight()).append(" | fee=").append(getBaggageFee()).append("\n");
        sb.append("Payment: date=").append(getPaymentDate()).append(" | mode=").append(getPaymentMode()).append("\n");
        sb.append("Invoice: totalFare=").append(getTotalFare()).append("\n");
        return sb.toString();
    }
}
