package s27967.q10;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    protected final List<String> validationErrors = new ArrayList<>();
    protected final int id;
    protected final String createdDate;
    protected final String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        if (id <= 0) addValidationError("id must be > 0");
    }

    protected void addValidationError(String message) { validationErrors.add(message); }

    public boolean isValid() { return validationErrors.isEmpty(); }

    public List<String> getValidationErrors() { return validationErrors; }
}
