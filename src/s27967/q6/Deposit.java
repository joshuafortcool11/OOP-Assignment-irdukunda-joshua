package s27967.q6;

public class Deposit extends Transaction {
    private final double depositAmount;
    private final String depositDate;

    public Deposit(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount);
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;

        if (depositAmount < 0) addValidationError("depositAmount must be >= 0");
    }

    public double getDepositAmount() { return depositAmount; }
    public String getDepositDate() { return depositDate; }
}
