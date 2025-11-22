package s27967.q8;

public class RecordEntry extends Payment {
    private double totalFine;

    public RecordEntry(int id, String createdDate, String updatedDate,
                       String libraryName, String location, String phoneNumber,
                       String sectionName, String sectionCode,
                       String title, String author, String isbn,
                       String memberName, int memberId, String contactNumber,
                       String borrowDate, String returnDate,
                       double fineAmount, int daysLate,
                       String paymentDate, String paymentMode,
                       double totalFine) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        this.totalFine = totalFine;

        if (totalFine <= 0) addValidationError("totalFine must be > 0");
    }

    public double getTotalFine() { return totalFine; }
    protected void setTotalFine(double v) { this.totalFine = v; }
}
