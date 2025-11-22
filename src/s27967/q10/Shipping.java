package s27967.q10;

public class Shipping extends Payment {
    private final String shippingAddress;
    private final double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate,
                    String storeName, String addressStore, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address,
                    String orderDate, String orderId,
                    String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId, paymentMethod, paymentStatus);
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;

        if (shippingCost < 0) addValidationError("shippingCost must be >= 0");
    }

    public String getShippingAddress() { return shippingAddress; }
    public double getShippingCost() { return shippingCost; }
}
