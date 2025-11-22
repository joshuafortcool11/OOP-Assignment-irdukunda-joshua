package s27967.q2;

import s27967.q1.Entity;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (departmentName == null || departmentName.isEmpty()) addValidationError("departmentName required");
        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[A-Za-z0-9]+"))
            addValidationError("departmentCode must be alphanumeric and at least 3 chars");
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) { this.departmentCode = departmentCode; }
}
