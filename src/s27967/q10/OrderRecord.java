package s27967.q10;

public final class OrderRecord extends Invoice {

    public OrderRecord(int id, String createdDate, String updatedDate,
                       String storeName, String addressStore, String email,
                       String categoryName, String categoryCode,
                       String productName, String productCode, double price,
                       String customerName, String contactNumber, String address,
                       String orderDate, String orderId,
                       String paymentMethod, String paymentStatus,
                       String shippingAddress, double shippingCost,
                       double totalAmount) {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost, totalAmount);
    }

    public double calculateTotalAmount() {
        double total = getPrice() + getShippingCost();
        setTotalAmount(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Store: ").append(getStoreName()).append(" | Address: ").append(getAddress()).append("\n");
        sb.append("Category: ").append(getCategoryName()).append(" | code: ").append(getCategoryCode()).append("\n");
        sb.append("Product: ").append(getProductName()).append(" | code: ").append(getProductCode()).append(" | price: ").append(getPrice()).append("\n");
        sb.append("Customer: ").append(getCustomerName()).append(" | contact: ").append(getContactNumber()).append(" | address: ").append(getCustomerAddress()).append("\n");
        sb.append("Order: id=").append(getOrderId()).append(" | date=").append(getOrderDate()).append("\n");
        sb.append("Payment: method=").append(getPaymentMethod()).append(" | status=").append(getPaymentStatus()).append("\n");
        sb.append("Shipping: address=").append(getShippingAddress()).append(" | cost=").append(getShippingCost()).append("\n");
        sb.append("Invoice: totalAmount=").append(getTotalAmount()).append("\n");
        return sb.toString();
    }
}
