package s27967.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

            public Treatment(int id, String createdDate, String updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, String roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost) {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
            if (diagnosis == null || diagnosis.isEmpty()) addValidationError("diagnosis required");
            if (treatmentGiven == null || treatmentGiven.isEmpty()) addValidationError("treatmentGiven required");
            if (treatmentCost <= 0) addValidationError("treatmentCost must be > 0");
            this.diagnosis = diagnosis;
            this.treatmentGiven = treatmentGiven;
            this.treatmentCost = treatmentCost;
            }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getTreatmentGiven() { return treatmentGiven; }
    public void setTreatmentGiven(String treatmentGiven) { this.treatmentGiven = treatmentGiven; }

    public double getTreatmentCost() { return treatmentCost; }
    public void setTreatmentCost(double treatmentCost) { this.treatmentCost = treatmentCost; }
}
