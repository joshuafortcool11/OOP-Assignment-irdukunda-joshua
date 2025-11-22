package s27967.q10;

public class Payment extends Order {
    private final String paymentMethod;
    private final String paymentStatus;

    public Payment(int id, String createdDate, String updatedDate,
                   String storeName, String addressStore, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus) {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId);
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;

        if (paymentMethod == null || paymentMethod.trim().isEmpty()) addValidationError("paymentMethod must not be empty");
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) addValidationError("paymentStatus must not be empty");
    }

    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentStatus() { return paymentStatus; }
}
