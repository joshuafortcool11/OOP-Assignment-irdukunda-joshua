package s27967.q8;

public class Member extends Book {
    private final String memberName;
    private final int memberId;
    private final String contactNumber;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String isbn,
                  String memberName, int memberId, String contactNumber) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn);
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;

        if (memberId <= 0) addValidationError("memberId must be > 0");
        if (memberName == null || memberName.trim().isEmpty()) addValidationError("memberName must not be empty");
    }

    public String getMemberName() { return memberName; }
    public int getMemberId() { return memberId; }
    public String getContactNumber() { return contactNumber; }
}
