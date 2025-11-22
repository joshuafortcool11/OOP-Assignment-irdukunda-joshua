package s27967.q6;

public class Customer extends Account {
    private final String customerName;
    private final String email;
    private final String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) addValidationError("email format invalid");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) addValidationError("phoneNumber must be 10 digits");
    }

    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
}
