package s27967.q8;

public class Fine extends Borrow {
    private final double fineAmount;
    private final int daysLate;

    public Fine(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String isbn,
                String memberName, int memberId, String contactNumber,
                String borrowDate, String returnDate,
                double fineAmount, int daysLate) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber, borrowDate, returnDate);
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;

        if (fineAmount < 0) addValidationError("fineAmount must be >= 0");
    }

    public double getFineAmount() { return fineAmount; }
    public int getDaysLate() { return daysLate; }
}
