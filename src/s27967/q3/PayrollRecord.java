package s27967.q3;

public final class PayrollRecord extends Salary {

    public PayrollRecord(int id, String createdDate, String updatedDate,
                         String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String phone,
                         String employeeName, int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, phone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays, housingAllowance, transportAllowance,
                taxDeduction, loanDeduction, basicSalary);
    }

    public double calculateNetSalary() {
        double allowances = getHousingAllowance() + getTransportAllowance();
        double deductions = getTaxDeduction() + getLoanDeduction();
        double gross = getBasicSalary() + allowances;
        double net = gross - deductions;
        setGrossSalary(gross);
        setNetSalary(net);
        return net;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company: ").append(getCompanyName()).append("\n");
        sb.append("Department: ").append(getDepartmentName()).append(" (code: ").append(getDepartmentCode()).append(")\n");
        sb.append("Manager: ").append(getManagerName()).append("\n");
        sb.append("Employee: ").append(getEmployeeName()).append(" | ID: ").append(getEmployeeId()).append(" | Designation: ").append(getDesignation()).append("\n");
        sb.append("Contact: ").append(getContactNumber()).append("\n");
        sb.append("Attendance: totalDays=").append(getTotalDays()).append(" presentDays=").append(getPresentDays()).append(" leaveDays=").append(getLeaveDays()).append("\n");
        sb.append("Allowances: housing=").append(getHousingAllowance()).append(" transport=").append(getTransportAllowance()).append("\n");
        sb.append("Deductions: tax=").append(getTaxDeduction()).append(" loan=").append(getLoanDeduction()).append("\n");
        sb.append("Basic: ").append(getBasicSalary()).append(" | Gross: ").append(getGrossSalary()).append(" | Net: ").append(getNetSalary()).append("\n");
        return sb.toString();
    }
}
