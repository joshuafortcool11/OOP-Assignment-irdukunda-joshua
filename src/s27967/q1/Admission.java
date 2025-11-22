package s27967.q1;

public class Admission extends Patient {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;

            public Admission(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, String roomNumber, double roomCharges) {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber);
            if (admissionDate == null || admissionDate.isEmpty()) addValidationError("admissionDate required");
            if (roomCharges <= 0) addValidationError("roomCharges must be > 0");
            this.admissionDate = admissionDate;
            this.roomNumber = roomNumber;
            this.roomCharges = roomCharges;
            }

    public String getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(String admissionDate) { this.admissionDate = admissionDate; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public double getRoomCharges() { return roomCharges; }
    public void setRoomCharges(double roomCharges) { this.roomCharges = roomCharges; }
}
