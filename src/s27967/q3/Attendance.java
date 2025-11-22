package s27967.q3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, String createdDate, String updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode,
                      String managerName, String managerEmail, String phone,
                      String employeeName, int employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode,
                managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber);
        if (totalDays < 0) addValidationError("totalDays must be >= 0");
        if (presentDays < 0) addValidationError("presentDays must be >= 0");
        if (leaveDays < 0) addValidationError("leaveDays must be >= 0");
        if (presentDays > totalDays) addValidationError("presentDays cannot exceed totalDays");
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    public int getTotalDays() { return totalDays; }
    public void setTotalDays(int totalDays) { this.totalDays = totalDays; }

    public int getPresentDays() { return presentDays; }
    public void setPresentDays(int presentDays) { this.presentDays = presentDays; }

    public int getLeaveDays() { return leaveDays; }
    public void setLeaveDays(int leaveDays) { this.leaveDays = leaveDays; }
}
