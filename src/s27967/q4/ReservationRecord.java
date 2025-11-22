package s27967.q4;

public final class ReservationRecord extends Feedback {

    public ReservationRecord(int id, String createdDate, String updatedDate,
                             String hotelName, String address, String phoneNumber, String email,
                             String roomNumber, String roomType, double pricePerNight,
                             String customerName, String customerEmail, String contactNumber,
                             String bookingDate, String checkInDate, String checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, String paymentDate,
                             double roomCharge, double serviceCharge,
                             int rating, String comments) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
                paymentMethod, paymentDate, roomCharge, serviceCharge, rating, comments);
    }

    public double generateBill() {
        double total = getRoomCharge() + getServiceCharge();
        setTotalBill(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel: ").append(getHotelName()).append("\n");
        sb.append("Room: ").append(getRoomNumber()).append(" | Type: ").append(getRoomType()).append(" | Price/Night: ").append(getPricePerNight()).append("\n");
        sb.append("Customer: ").append(getCustomerName()).append(" | Contact: ").append(getContactNumber()).append(" | Email: ").append(getCustomerEmail()).append("\n");
        sb.append("Booking: ").append(getBookingDate()).append(" | CheckIn: ").append(getCheckInDate()).append(" | CheckOut: ").append(getCheckOutDate()).append("\n");
        sb.append("Service: ").append(getServiceName()).append(" | ServiceCost: ").append(getServiceCost()).append("\n");
        sb.append("Payment: ").append(getPaymentMethod()).append(" | PaymentDate: ").append(getPaymentDate()).append("\n");
        sb.append("RoomCharge: ").append(getRoomCharge()).append(" | ServiceCharge: ").append(getServiceCharge()).append(" | Total: ").append(getTotalBill()).append("\n");
        sb.append("Feedback: rating=").append(getRating()).append(" | comments=").append(getComments()).append("\n");
        return sb.toString();
    }
}
