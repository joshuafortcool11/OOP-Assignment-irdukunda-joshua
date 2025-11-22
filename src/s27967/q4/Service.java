package s27967.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        if (serviceName == null || serviceName.isEmpty()) addValidationError("serviceName required");
        if (serviceCost <= 0) addValidationError("serviceCost must be > 0");
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public double getServiceCost() { return serviceCost; }
    public void setServiceCost(double serviceCost) { this.serviceCost = serviceCost; }
}
