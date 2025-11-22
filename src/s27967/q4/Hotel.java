package s27967.q4;

import s27967.q1.Entity;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        if (hotelName == null || hotelName.isEmpty()) addValidationError("hotelName required");
        if (address == null || address.isEmpty()) addValidationError("address required");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) addValidationError("phone must be 10 digits");
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) addValidationError("invalid email");
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
