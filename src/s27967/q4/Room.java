package s27967.q4;

import s27967.q1.Entity;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight) {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        if (roomNumber == null || roomNumber.isEmpty()) addValidationError("roomNumber required");
        if (roomType == null || roomType.isEmpty()) addValidationError("roomType required");
        if (pricePerNight <= 0) addValidationError("pricePerNight must be > 0");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }
}
