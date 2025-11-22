package s27967.q10;

public class Store extends Entity {
    private final String storeName;
    private final String address;
    private final String email;

    public Store(int id, String createdDate, String updatedDate,
                 String storeName, String address, String email) {
        super(id, createdDate, updatedDate);
        this.storeName = storeName;
        this.address = address;
        this.email = email;

        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) addValidationError("email format invalid");
    }

    public String getStoreName() { return storeName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
}
