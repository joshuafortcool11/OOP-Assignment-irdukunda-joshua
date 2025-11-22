package s27967.q6;

public class Transaction extends Customer {
    private final String transactionId;
    private final String transactionType;
    private final double amount;

    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber);
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;

        if (amount < 0) addValidationError("amount must be >= 0");
    }

    public String getTransactionId() { return transactionId; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
}
