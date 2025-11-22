package s27967.q1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    // validation storage (no exceptions thrown for validation)
    protected final List<String> validationErrors = new ArrayList<>();

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) validationErrors.add("id must be > 0");
        if (createdDate == null || createdDate.isEmpty()) validationErrors.add("createdDate required");
        if (updatedDate == null || updatedDate.isEmpty()) validationErrors.add("updatedDate required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    protected void addValidationError(String msg) {
        if (msg != null && !msg.isEmpty()) validationErrors.add(msg);
    }

    public boolean isValid() {
        return validationErrors.isEmpty();
    }

    public List<String> getValidationErrors() {
        return Collections.unmodifiableList(validationErrors);
    }

    public String getValidationMessage() {
        return String.join("; ", validationErrors);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) { this.updatedDate = updatedDate; }
}
