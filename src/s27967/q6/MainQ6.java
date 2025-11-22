package s27967.q6;

import java.util.Scanner;

public class MainQ6 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(ID + " Enter banking record details (press Enter after each):");

            System.out.print("id (int): ");
            int id = parseIntFlexible(sc.nextLine().trim());

            System.out.print("createdDate: ");
            String createdDate = sc.nextLine().trim();

            System.out.print("updatedDate: ");
            String updatedDate = sc.nextLine().trim();

            System.out.print("bankName: ");
            String bankName = sc.nextLine().trim();

            System.out.print("branchCode: ");
            String branchCode = sc.nextLine().trim();

            System.out.print("bankAddress: ");
            String bankAddress = sc.nextLine().trim();

            System.out.print("accountNumber: ");
            String accountNumber = sc.nextLine().trim();

            System.out.print("accountType: ");
            String accountType = sc.nextLine().trim();

            System.out.print("balance (double): ");
            double balance = Double.parseDouble(sc.nextLine().trim());

            System.out.print("customerName: ");
            String customerName = sc.nextLine().trim();

            System.out.print("email: ");
            String email = sc.nextLine().trim();

            System.out.print("phoneNumber (10 digits): ");
            String phoneNumber = sc.nextLine().trim();

            System.out.print("transactionId: ");
            String transactionId = sc.nextLine().trim();

            System.out.print("transactionType: ");
            String transactionType = sc.nextLine().trim();

            System.out.print("amount (double): ");
            double amount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("depositAmount (double): ");
            double depositAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("depositDate: ");
            String depositDate = sc.nextLine().trim();

            System.out.print("withdrawalAmount (double): ");
            double withdrawalAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("withdrawalDate: ");
            String withdrawalDate = sc.nextLine().trim();

            System.out.print("loanAmount (double): ");
            double loanAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("interestRate (double percent): ");
            double interestRate = Double.parseDouble(sc.nextLine().trim());

            System.out.print("duration (int): ");
            int duration = parseIntFlexible(sc.nextLine().trim());

            System.out.print("paymentAmount (double): ");
            double paymentAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("paymentDate: ");
            String paymentDate = sc.nextLine().trim();

            AccountRecord r = new AccountRecord(id, createdDate, updatedDate,
                    bankName, branchCode, bankAddress,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, amount,
                    depositAmount, depositDate,
                    withdrawalAmount, withdrawalDate,
                    loanAmount, interestRate, duration,
                    paymentAmount, paymentDate);

            if (!r.isValid()) {
                System.out.println(ID + " Validation errors:");
                for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
                return;
            }

            double interest = r.calculateInterest();
            System.out.println(ID + " --- Account Record ---");
            System.out.print(r.getDetails());
            System.out.println(ID + " Calculated Interest: " + interest);

        } catch (Exception ex) {
            System.out.println(ID + " Error: " + ex.getMessage());
        }
    }

    // Helper: parse integers but accept numeric strings with decimal part (e.g. "500.0")
    private static int parseIntFlexible(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            try {
                double d = Double.parseDouble(s);
                return (int) d;
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("Invalid integer value: '" + s + "'");
            }
        }
    }
}
