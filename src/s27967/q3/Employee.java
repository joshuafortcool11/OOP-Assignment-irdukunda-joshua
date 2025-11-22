package s27967.q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String phone,
                    String employeeName, int employeeId, String designation, String contactNumber) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode,
                managerName, managerEmail, phone);
        if (employeeName == null || employeeName.isEmpty()) addValidationError("employeeName required");
        if (employeeId <= 0) addValidationError("employeeId must be > 0");
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) addValidationError("contactNumber must be 10 digits");
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
