package s27967.q3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, String createdDate, String updatedDate,
                     String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String phone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode,
                managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays, housingAllowance, transportAllowance);
        if (taxDeduction < 0) addValidationError("taxDeduction must be >= 0");
        if (loanDeduction < 0) addValidationError("loanDeduction must be >= 0");
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTaxDeduction() { return taxDeduction; }
    public void setTaxDeduction(double taxDeduction) { this.taxDeduction = taxDeduction; }

    public double getLoanDeduction() { return loanDeduction; }
    public void setLoanDeduction(double loanDeduction) { this.loanDeduction = loanDeduction; }
}
