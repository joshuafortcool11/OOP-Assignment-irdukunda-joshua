package s27967.q8;

public class Borrow extends Member {
    private final String borrowDate;
    private final String returnDate;

    public Borrow(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String isbn,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber);
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;

        if (borrowDate == null || borrowDate.trim().isEmpty()) addValidationError("borrowDate must not be empty");
        if (returnDate == null || returnDate.trim().isEmpty()) addValidationError("returnDate must not be empty");
    }

    public String getBorrowDate() { return borrowDate; }
    public String getReturnDate() { return returnDate; }
}
