package s27967.q10;

public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate,
                   String storeName, String addressStore, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus,
                   String shippingAddress, double shippingCost,
                   double totalAmount) {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
        this.totalAmount = totalAmount;
        if (totalAmount <= 0) addValidationError("totalAmount must be > 0");
    }

    public double getTotalAmount() { return totalAmount; }
    protected void setTotalAmount(double v) { this.totalAmount = v; }
}
