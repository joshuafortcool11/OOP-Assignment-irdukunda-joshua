package s27967.q1;

public class Main {
    private static final String ID = "27967";

    public static void main(String[] args) {

        int hid = 1;
        String created = "2025-11-22";
        String updated = "2025-11-22";
        String hname = "General Hospital";
        String addr = "123 Main St";
        String hphone = "0123456789";
        String hemail = "info@hospital.com";

        String dname = "Cardiology";
        String dcode = "CARD01";

        String docName = "Dr. John Doe";
        String spec = "Cardiology";
        String docEmail = "dr.john@hospital.com";
        String docPhone = "0987654321";

        String nurseName = "Nurse Amy";
        String shift = "Day";
        int years = 5;

        String pName = "Alice Smith";
        int age = 30;
        String gender = "Female";
        String contact = "0712345678";

        String adate = "2025-11-20";
        String room = "101";
        double roomCharges = 500.0;

        String diagnosis = "Flu";
        String treatmentGiven = "Rest and meds";
        double treatmentCost = 150.0;

        double doctorFee = 200.0;
        double medicineCost = 50.0;

        HospitalRecord record = new HospitalRecord(
                hid, created, updated,
                hname, addr, hphone, hemail,
                dname, dcode,
                docName, spec, docEmail, docPhone,
                nurseName, shift, years,
                pName, age, gender, contact,
                adate, room, roomCharges,
                diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost
        );

        if (!record.isValid()) {
            System.out.println("\n" + ID + " Validation errors:");
            for (String msg : record.getValidationErrors()) {
                System.out.println(ID + " " + msg);
            }
            return;
        }

        double total = record.generateBill();
        System.out.println("\n" + ID + " --- Hospital Record Summary ---");
        System.out.println(record.getDetails());
        System.out.println(ID + " Total Bill: " + total);
    }
}
