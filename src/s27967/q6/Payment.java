package s27967.q6;

public class Payment extends Loan {
    private final double paymentAmount;
    private final String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;

        if (paymentAmount < 0) addValidationError("paymentAmount must be >= 0");
    }

    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate() { return paymentDate; }
}
