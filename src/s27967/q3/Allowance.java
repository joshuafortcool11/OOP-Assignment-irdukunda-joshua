package s27967.q3;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance(int id, String createdDate, String updatedDate,
                     String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String phone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode,
                managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays);
        if (housingAllowance < 0) addValidationError("housingAllowance must be >= 0");
        if (transportAllowance < 0) addValidationError("transportAllowance must be >= 0");
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) { this.housingAllowance = housingAllowance; }

    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) { this.transportAllowance = transportAllowance; }
}
