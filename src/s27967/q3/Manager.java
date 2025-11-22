package s27967.q3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phone) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        if (managerName == null || managerName.isEmpty()) addValidationError("managerName required");
        if (managerEmail == null || !managerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) addValidationError("invalid manager email");
        if (phone == null || !phone.matches("\\d{10}")) addValidationError("manager phone must be 10 digits");
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }

    public String getManagerEmail() { return managerEmail; }
    public void setManagerEmail(String managerEmail) { this.managerEmail = managerEmail; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
