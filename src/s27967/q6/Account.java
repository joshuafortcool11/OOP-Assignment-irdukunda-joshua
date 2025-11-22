package s27967.q6;

public class Account extends Bank {
    private final String accountNumber;
    private final String accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;

        if (balance < 0) addValidationError("balance must be >= 0");
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    protected void setBalance(double b) { this.balance = b; }
}
