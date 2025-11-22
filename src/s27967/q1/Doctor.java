package s27967.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
        if (doctorName == null || doctorName.isEmpty()) addValidationError("doctorName required");
        if (specialization == null || specialization.isEmpty()) addValidationError("specialization required");
        if (doctorEmail == null || !doctorEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) addValidationError("invalid doctor email");
        if (phone == null || !phone.matches("\\d{10}")) addValidationError("doctor phone must be 10 digits");
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getDoctorEmail() { return doctorEmail; }
    public void setDoctorEmail(String doctorEmail) { this.doctorEmail = doctorEmail; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
