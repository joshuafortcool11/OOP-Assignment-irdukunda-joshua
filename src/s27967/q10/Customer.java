package s27967.q10;

public class Customer extends Product {
    private final String customerName;
    private final String contactNumber;
    private final String address;

    public Customer(int id, String createdDate, String updatedDate,
                    String storeName, String addressStore, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address) {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price);
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;

        if (customerName == null || customerName.trim().isEmpty()) addValidationError("customerName must not be empty");
        if (contactNumber == null || contactNumber.trim().isEmpty()) addValidationError("contactNumber must not be empty");
        if (address == null || address.trim().isEmpty()) addValidationError("address must not be empty");
    }

    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
    public String getCustomerAddress() { return address; }
}
