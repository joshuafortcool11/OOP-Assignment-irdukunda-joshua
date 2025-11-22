package s27967.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone,
                   String studentName, int rollNumber, String grade, String contactNumber) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone);
        if (studentName == null || studentName.isEmpty()) addValidationError("studentName required");
        if (rollNumber <= 0) addValidationError("rollNumber must be > 0");
        if (grade == null || grade.isEmpty()) addValidationError("grade required");
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) addValidationError("contactNumber must be 10 digits");
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
