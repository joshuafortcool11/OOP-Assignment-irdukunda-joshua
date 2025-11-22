package s27967.q3;

import s27967.q1.Entity;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        if (companyName == null || companyName.isEmpty()) addValidationError("companyName required");
        if (address == null || address.isEmpty()) addValidationError("address required");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) addValidationError("phone must be 10 digits");
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) addValidationError("invalid email");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
