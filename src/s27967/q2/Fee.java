package s27967.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, String createdDate, String updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String phone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, double maxMarks, String examDate,
               double obtainedMarks, String remarks,
               double tuitionFee, double examFee) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
        if (tuitionFee <= 0) addValidationError("tuitionFee must be > 0");
        if (examFee <= 0) addValidationError("examFee must be > 0");
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = tuitionFee + examFee;
        if (this.totalFee <= 0) addValidationError("totalFee must be > 0");
    }

    public double getTuitionFee() { return tuitionFee; }
    public void setTuitionFee(double tuitionFee) { this.tuitionFee = tuitionFee; }

    public double getExamFee() { return examFee; }
    public void setExamFee(double examFee) { this.examFee = examFee; }

    public double getTotalFee() { return totalFee; }
    public void setTotalFee(double totalFee) { this.totalFee = totalFee; }
}
