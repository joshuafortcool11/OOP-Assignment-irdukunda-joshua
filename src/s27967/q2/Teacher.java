package s27967.q2;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);
        if (teacherName == null || teacherName.isEmpty()) addValidationError("teacherName required");
        if (subject == null || subject.isEmpty()) addValidationError("subject required");
        if (teacherEmail == null || !teacherEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) addValidationError("invalid teacher email");
        if (phone == null || !phone.matches("\\d{10}")) addValidationError("teacher phone must be 10 digits");
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getTeacherEmail() { return teacherEmail; }
    public void setTeacherEmail(String teacherEmail) { this.teacherEmail = teacherEmail; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
