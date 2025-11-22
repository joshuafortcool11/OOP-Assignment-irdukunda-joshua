package s27967.q6;

public class Withdrawal extends Deposit {
    private final double withdrawalAmount;
    private final String withdrawalDate;

    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;

        if (withdrawalAmount < 0) addValidationError("withdrawalAmount must be >= 0");
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
    public String getWithdrawalDate() { return withdrawalDate; }
}
