package s27967.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;


            public Bill(int id, String createdDate, String updatedDate,
                String hospitalName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String phone,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                String admissionDate, String roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFee, double medicineCost) {
            super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost);
            if (doctorFee <= 0) addValidationError("doctorFee must be > 0");
            if (medicineCost < 0) addValidationError("medicineCost must be >= 0");
            this.doctorFee = doctorFee;
            this.medicineCost = medicineCost;
            }

    public double getDoctorFee() { return doctorFee; }
    public void setDoctorFee(double doctorFee) { this.doctorFee = doctorFee; }

    public double getMedicineCost() { return medicineCost; }
    public void setMedicineCost(double medicineCost) { this.medicineCost = medicineCost; }

    public double getTotalBill() { return totalBill; }
    public void setTotalBill(double totalBill) { this.totalBill = totalBill; }
}
