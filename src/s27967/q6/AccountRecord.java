package s27967.q6;

import java.util.List;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, String createdDate, String updatedDate,
                         String bankName, String branchCode, String address,
                         String accountNumber, String accountType, double balance,
                         String customerName, String email, String phoneNumber,
                         String transactionId, String transactionType, double amount,
                         double depositAmount, String depositDate,
                         double withdrawalAmount, String withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public double calculateInterest() {
        return getLoanAmount() * getInterestRate() * getDuration() / 100.0;
    }

    @Override
    public boolean isValid() {
        return validationErrors.isEmpty();
    }

    @Override
    public List<String> getValidationErrors() {
        return validationErrors;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank: ").append(getBankName()).append(" | Branch: ").append(getBranchCode()).append("\n");
        sb.append("Account: ").append(getAccountNumber()).append(" | Type: ").append(getAccountType()).append(" | Balance: ").append(getBalance()).append("\n");
        sb.append("Customer: ").append(getCustomerName()).append(" | Email: ").append(getEmail()).append(" | Phone: ").append(getPhoneNumber()).append("\n");
        sb.append("Transaction: id=").append(getTransactionId()).append(" | type=").append(getTransactionType()).append(" | amount=").append(getAmount()).append("\n");
        sb.append("Deposit: amount=").append(getDepositAmount()).append(" | date=").append(getDepositDate()).append("\n");
        sb.append("Withdrawal: amount=").append(getWithdrawalAmount()).append(" | date=").append(getWithdrawalDate()).append("\n");
        sb.append("Loan: amount=").append(getLoanAmount()).append(" | rate=").append(getInterestRate()).append(" | duration=").append(getDuration()).append(" | interest=").append(calculateInterest()).append("\n");
        sb.append("Payment: amount=").append(getPaymentAmount()).append(" | date=").append(getPaymentDate()).append("\n");
        return sb.toString();
    }
}
