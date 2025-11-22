package s27967.q2;

public class Result extends Exam {
    private double obtainedMarks;
    private String remarks;

    public Result(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, double maxMarks, String examDate,
                  double obtainedMarks, String remarks) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours, examName, maxMarks, examDate);
        if (obtainedMarks < 0) addValidationError("obtainedMarks must be >= 0");
        if (remarks == null || remarks.isEmpty()) addValidationError("remarks required");
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public double getObtainedMarks() { return obtainedMarks; }
    public void setObtainedMarks(double obtainedMarks) { this.obtainedMarks = obtainedMarks; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}
