package s27967.q4;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber);
        if (bookingDate == null || bookingDate.isEmpty()) addValidationError("bookingDate required");
        if (checkInDate == null || checkInDate.isEmpty()) addValidationError("checkInDate required");
        if (checkOutDate == null || checkOutDate.isEmpty()) addValidationError("checkOutDate required");
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }

    public String getCheckInDate() { return checkInDate; }
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }

    public String getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
}
