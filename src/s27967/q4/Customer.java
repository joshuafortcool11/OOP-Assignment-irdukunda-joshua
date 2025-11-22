package s27967.q4;

import s27967.q1.Entity;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);
        if (customerName == null || customerName.isEmpty()) addValidationError("customerName required");
        if (customerEmail == null || !customerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) addValidationError("invalid customer email");
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) addValidationError("contactNumber must be 10 digits");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
