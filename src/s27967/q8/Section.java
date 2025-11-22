package s27967.q8;

public class Section extends Library {
    private final String sectionName;
    private final String sectionCode;

    public Section(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;

        if (sectionCode == null || sectionCode.length() < 3) addValidationError("sectionCode must be at least 3 characters");
    }

    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}
