package s27967.q3;

public class MainQ3 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        int id = 1;
        String createdDate = "2025-11-22";
        String updatedDate = "2025-11-22";
        String companyName = "Example Co";
        String address = "123 Business Rd";
        String phoneNumber = "0123456789";
        String email = "info@example.com";
        String departmentName = "HR";
        String departmentCode = "HR01";
        String managerName = "Jane Manager";
        String managerEmail = "jane@example.com";
        String managerPhone = "0713333333";
        String employeeName = "Bob Employee";
        int employeeId = 200;
        String designation = "Developer";
        String contactNumber = "0714444444";
        int totalDays = 30;
        int presentDays = 28;
        int leaveDays = 2;
        double housingAllowance = 100.0;
        double transportAllowance = 50.0;
        double taxDeduction = 10.0;
        double loanDeduction = 5.0;
        double basicSalary = 2000.0;

        PayrollRecord p = new PayrollRecord(
                id, createdDate, updatedDate,
                companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary
        );

        if (!p.isValid()) {
            System.out.println(ID + " Validation errors:");
            for (String err : p.getValidationErrors()) System.out.println(ID + " " + err);
            return;
        }

        double net = p.calculateNetSalary();
        System.out.println(ID + " --- Payroll Record ---");
        System.out.print(p.getDetails());
        System.out.println(ID + " Net Salary: " + net);
    }
}
