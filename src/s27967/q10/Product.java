package s27967.q10;

public class Product extends Category {
    private final String productName;
    private final String productCode;
    private final double price;

    public Product(int id, String createdDate, String updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price) {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;

        if (price <= 0) addValidationError("price must be > 0");
    }

    public String getProductName() { return productName; }
    public String getProductCode() { return productCode; }
    public double getPrice() { return price; }
}
