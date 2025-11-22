package s27967.q8;

public class Payment extends Fine {
    private final String paymentDate;
    private final String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String isbn,
                   String memberName, int memberId, String contactNumber,
                   String borrowDate, String returnDate,
                   double fineAmount, int daysLate,
                   String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate);
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;

        if (paymentDate == null || paymentDate.trim().isEmpty()) addValidationError("paymentDate must not be empty");
        if (paymentMode == null || paymentMode.trim().isEmpty()) addValidationError("paymentMode must not be empty");
    }

    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}
