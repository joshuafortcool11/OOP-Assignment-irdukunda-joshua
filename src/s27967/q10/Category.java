package s27967.q10;

public class Category extends Store {
    private final String categoryName;
    private final String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, storeName, address, email);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;

        if (categoryCode == null || categoryCode.length() < 3) addValidationError("categoryCode must be at least 3 characters");
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}
