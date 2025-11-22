package s27967.q1;

import java.util.regex.Pattern;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        if (hospitalName == null || hospitalName.isEmpty()) addValidationError("hospitalName required");
        if (address == null || address.isEmpty()) addValidationError("address required");
        if (!isValidPhone(phoneNumber)) addValidationError("phone must be 10 digits");
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) addValidationError("invalid email");
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    private boolean isValidPhone(String p) {
        return p != null && p.matches("\\d{10}");
    }

    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
