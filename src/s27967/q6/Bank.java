package s27967.q6;

public class Bank extends Entity {
    private final String bankName;
    private final String branchCode;
    private final String address;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address) {
        super(id, createdDate, updatedDate);
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;

        if (branchCode == null || branchCode.length() < 3) addValidationError("branchCode must be at least 3 characters");
    }

    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
    public String getAddress() { return address; }
}
