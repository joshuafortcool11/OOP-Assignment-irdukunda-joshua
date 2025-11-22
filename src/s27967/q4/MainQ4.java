package s27967.q4;

public class MainQ4 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        int id = 1;
        String createdDate = "2025-11-22";
        String updatedDate = "2025-11-22";
        String hotelName = "Grand Hotel";
        String address = "456 Stay Ave";
        String phoneNumber = "0123456789";
        String email = "hotel@example.com";
        String roomNumber = "101";
        String roomType = "Single";
        double pricePerNight = 100.0;
        String customerName = "Alice Guest";
        String customerEmail = "alice@example.com";
        String contactNumber = "0715555555";
        String bookingDate = "2025-11-20";
        String checkInDate = "2025-11-21";
        String checkOutDate = "2025-11-22";
        String serviceName = "Breakfast";
        double serviceCost = 20.0;
        String paymentMethod = "Credit Card";
        String paymentDate = "2025-11-21";
        double roomCharge = 100.0;
        double serviceCharge = 20.0;
        int rating = 5;
        String comments = "Nice stay";

        ReservationRecord r = new ReservationRecord(
                id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                rating, comments
        );

        if (!r.isValid()) {
            System.out.println(ID + " Validation errors:");
            for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
            return;
        }

        double total = r.generateBill();
        System.out.println(ID + " --- Reservation Record ---");
        System.out.print(r.getDetails());
        System.out.println(ID + " Total Bill: " + total);
    }
}
