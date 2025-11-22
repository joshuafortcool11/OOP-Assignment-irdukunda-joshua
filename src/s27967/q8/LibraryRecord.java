package s27967.q8;

public final class LibraryRecord extends RecordEntry {

    public LibraryRecord(int id, String createdDate, String updatedDate,
                         String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode,
                         String title, String author, String isbn,
                         String memberName, int memberId, String contactNumber,
                         String borrowDate, String returnDate,
                         double fineAmount, int daysLate,
                         String paymentDate, String paymentMode,
                         double totalFine) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, isbn, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }

    public double calculateFine() {
        double total = getFineAmount() * getDaysLate();
        setTotalFine(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library: ").append(getLibraryName()).append(" | Location: ").append(getLocation()).append("\n");
        sb.append("Section: ").append(getSectionName()).append(" | code: ").append(getSectionCode()).append("\n");
        sb.append("Book: ").append(getTitle()).append(" | Author: ").append(getAuthor()).append(" | ISBN: ").append(getIsbn()).append("\n");
        sb.append("Member: ").append(getMemberName()).append(" | ID: ").append(getMemberId()).append(" | Contact: ").append(getContactNumber()).append("\n");
        sb.append("Borrow: from=").append(getBorrowDate()).append(" | to=").append(getReturnDate()).append("\n");
        sb.append("Fine: amount=").append(getFineAmount()).append(" | daysLate=").append(getDaysLate()).append(" | totalFine=").append(getTotalFine()).append("\n");
        sb.append("Payment: date=").append(getPaymentDate()).append(" | mode=").append(getPaymentMode()).append("\n");
        return sb.toString();
    }
}
