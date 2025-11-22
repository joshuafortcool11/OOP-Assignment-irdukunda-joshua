package s27967.q2;

public final class StudentRecord extends Fee {

    public StudentRecord(int id, String createdDate, String updatedDate,
                         String schoolName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String teacherName, String subject, String teacherEmail, String phone,
                         String studentName, int rollNumber, String grade, String contactNumber,
                         String courseName, String courseCode, int creditHours,
                         String examName, double maxMarks, String examDate,
                         double obtainedMarks, String remarks,
                         double tuitionFee, double examFee) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours,
                examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee);
    }

    public double calculateAverageMarks() {
        double max = getMaxMarks();
        if (max <= 0) return 0.0;
        return (getObtainedMarks() / max) * 100.0;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("School: ").append(getSchoolName()).append("\n");
        sb.append("Department: ").append(getDepartmentName()).append("\n");
        sb.append("Teacher: ").append(getTeacherName()).append(" | Subject: ").append(getSubject()).append("\n");
        sb.append("Student: ").append(getStudentName()).append(" | Roll: ").append(getRollNumber()).append(" | Grade: ").append(getGrade()).append("\n");
        sb.append("Course: ").append(getCourseName()).append(" (code: ").append(getCourseCode()).append(") | CreditHours: ").append(getCreditHours()).append("\n");
        sb.append("Exam: ").append(getExamName()).append(" | Date: ").append(getExamDate()).append(" | MaxMarks: ").append(getMaxMarks()).append("\n");
        sb.append("Obtained: ").append(getObtainedMarks()).append(" | Remarks: ").append(getRemarks()).append("\n");
        sb.append("Average%: ").append(calculateAverageMarks()).append("\n");
        sb.append("Tuition: ").append(getTuitionFee()).append(" | ExamFee: ").append(getExamFee()).append(" | TotalFee: ").append(getTotalFee()).append("\n");
        return sb.toString();
    }
}
