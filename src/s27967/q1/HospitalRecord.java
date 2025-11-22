package s27967.q1;

public final class HospitalRecord extends Bill {

        public HospitalRecord(int id, String createdDate, String updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone,
                  String nurseName, String shift, int yearsOfExperience,
                  String patientName, int age, String gender, String contactNumber,
                  String admissionDate, String roomNumber, double roomCharges,
                  String diagnosis, String treatmentGiven, double treatmentCost,
                  double doctorFee, double medicineCost) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
            departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
            nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
            admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
            doctorFee, medicineCost);
        }

    public double generateBill() {
        double total = getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
        setTotalBill(total);
        return total;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital: ").append(getHospitalName()).append("\n");
        sb.append("Address: ").append(getAddress()).append("\n");
        sb.append("Hospital phone: ").append(getPhoneNumber()).append(" | email: ").append(getEmail()).append("\n");
        sb.append("Department: ").append(getDepartmentName()).append(" (code: ").append(getDepartmentCode()).append(")\n");
        sb.append("Doctor: ").append(getDoctorName()).append(" | specialization: ").append(getSpecialization()).append("\n");
        sb.append("Nurse: ").append(getNurseName()).append(" | shift: ").append(getShift()).append("\n");
        sb.append("Patient: ").append(getPatientName()).append(" | Age: ").append(getAge()).append(" | Gender: ").append(getGender()).append("\n");
        sb.append("Contact: ").append(getContactNumber()).append("\n");
        sb.append("Admission date: ").append(getAdmissionDate()).append(" | Room: ").append(getRoomNumber()).append(" | Room charges: ").append(getRoomCharges()).append("\n");
        sb.append("Diagnosis: ").append(getDiagnosis()).append(" | Treatment: ").append(getTreatmentGiven()).append(" | Treatment cost: ").append(getTreatmentCost()).append("\n");
        sb.append("Doctor fee: ").append(getDoctorFee()).append(" | Medicine cost: ").append(getMedicineCost()).append("\n");
        sb.append("Total computed (if generated): ").append(getTotalBill()).append("\n");
        return sb.toString();
    }
}
