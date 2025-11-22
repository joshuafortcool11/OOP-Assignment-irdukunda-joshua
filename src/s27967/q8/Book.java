package s27967.q8;

public class Book extends Section {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String isbn) {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        this.title = title;
        this.author = author;
        this.isbn = isbn;

        if (isbn == null || isbn.length() < 10) addValidationError("ISBN must be at least 10 characters");
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
}
