package s27967.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

            public Nurse(int id, String createdDate, String updatedDate,
                 String hospitalName, String address, String phoneNumber, String email,
                 String departmentName, String departmentCode,
                 String doctorName, String specialization, String doctorEmail, String phone,
                 String nurseName, String shift, int yearsOfExperience) {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone);
            if (nurseName == null || nurseName.isEmpty()) addValidationError("nurseName required");
            if (shift == null || !(shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night"))) addValidationError("shift must be Day or Night");
            if (yearsOfExperience < 0) addValidationError("yearsOfExperience must be >= 0");
            this.nurseName = nurseName;
            this.shift = shift;
            this.yearsOfExperience = yearsOfExperience;
            }

    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }
}
