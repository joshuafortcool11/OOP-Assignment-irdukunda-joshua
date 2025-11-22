package s27967.q2;

public class MainQ2 {
    private static final String ID = "27967";

    public static void main(String[] args) {

        int id = 1;
        String createdDate = "2025-11-22";
        String updatedDate = "2025-11-22";
        String schoolName = "Example School";
        String address = "123 School Rd";
        String phoneNumber = "0123456789";
        String email = "school@example.com";
        String departmentName = "Science Dept";
        String departmentCode = "SCI01";
        String teacherName = "Prof. Smith";
        String subject = "Physics";
        String teacherEmail = "prof.smith@example.com";
        String teacherPhone = "0711111111";
        String studentName = "John Student";
        int rollNumber = 100;
        String grade = "A";
        String contactNumber = "0712222222";
        String courseName = "Physics 101";
        String courseCode = "PHY101";
        int creditHours = 3;
        String examName = "Final Exam";
        double maxMarks = 100.0;
        String examDate = "2025-12-01";
        double obtainedMarks = 85.0;
        String remarks = "Good";
        double tuitionFee = 1500.0;
        double examFee = 50.0;

        StudentRecord r = new StudentRecord(
                id, createdDate, updatedDate,
                schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks,
                tuitionFee, examFee
        );

        if (!r.isValid()) {
            System.out.println(ID + " Validation errors:");
            for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
            return;
        }

        System.out.println(ID + " --- Student Record ---");
        System.out.print(r.getDetails());
        System.out.println(ID + " Average%: " + r.calculateAverageMarks());
    }
}
