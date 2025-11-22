package s27967.q6;

public class Loan extends Withdrawal {
    private final double loanAmount;
    private final double interestRate; // percent
    private final int duration; // in years (or units as per input)

    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;

        if (loanAmount < 0) addValidationError("loanAmount must be >= 0");
        if (interestRate < 0) addValidationError("interestRate must be >= 0");
        if (duration <= 0) addValidationError("duration must be > 0");
    }

    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100.0;
    }
}
