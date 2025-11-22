package s27967.q2;

import s27967.q1.Entity;
import java.util.regex.Pattern;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        if (schoolName == null || schoolName.isEmpty()) addValidationError("schoolName required");
        if (address == null || address.isEmpty()) addValidationError("address required");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) addValidationError("phone must be 10 digits");
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) addValidationError("invalid email");
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
