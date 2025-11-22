package s27967.q10;

public class Order extends Customer {
    private final String orderDate;
    private final String orderId;

    public Order(int id, String createdDate, String updatedDate,
                 String storeName, String addressStore, String email,
                 String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String address,
                 String orderDate, String orderId) {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address);
        this.orderDate = orderDate;
        this.orderId = orderId;

        if (orderDate == null || orderDate.trim().isEmpty()) addValidationError("orderDate must not be empty");
        if (orderId == null || orderId.trim().isEmpty()) addValidationError("orderId must not be empty");
    }

    public String getOrderDate() { return orderDate; }
    public String getOrderId() { return orderId; }
}
