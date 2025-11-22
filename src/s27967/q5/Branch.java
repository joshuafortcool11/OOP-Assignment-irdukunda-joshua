package s27967.q5;

public class Branch extends Company {
    private final String branchName;
    private final String locationCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        this.branchName = branchName;
        this.locationCode = locationCode;

        if (locationCode == null || locationCode.length() < 3) addValidationError("locationCode must be at least 3 characters");
    }

    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }
}
