package s27967.q7;

import java.util.Scanner;

public class MainQ7 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(ID + " Enter real estate record details (press Enter after each):");

            System.out.print("id (int): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("createdDate: ");
            String createdDate = sc.nextLine().trim();

            System.out.print("updatedDate: ");
            String updatedDate = sc.nextLine().trim();

            System.out.print("agencyName: ");
            String agencyName = sc.nextLine().trim();

            System.out.print("location: ");
            String location = sc.nextLine().trim();

            System.out.print("agencyPhone (10 digits): ");
            String phone = sc.nextLine().trim();

            System.out.print("agentName: ");
            String agentName = sc.nextLine().trim();

            System.out.print("agentEmail: ");
            String agentEmail = sc.nextLine().trim();

            System.out.print("licenseNumber: ");
            String licenseNumber = sc.nextLine().trim();

            System.out.print("propertyCode: ");
            String propertyCode = sc.nextLine().trim();

            System.out.print("propertyType: ");
            String propertyType = sc.nextLine().trim();

            System.out.print("price (double): ");
            double price = Double.parseDouble(sc.nextLine().trim());

            System.out.print("sellerName: ");
            String sellerName = sc.nextLine().trim();

            System.out.print("sellerContact: ");
            String sellerContact = sc.nextLine().trim();

            System.out.print("buyerName: ");
            String buyerName = sc.nextLine().trim();

            System.out.print("buyerEmail: ");
            String buyerEmail = sc.nextLine().trim();

            System.out.print("agreementDate: ");
            String agreementDate = sc.nextLine().trim();

            System.out.print("terms: ");
            String terms = sc.nextLine().trim();

            System.out.print("paymentAmount (double): ");
            double paymentAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("paymentDate: ");
            String paymentDate = sc.nextLine().trim();

            System.out.print("commissionRate (double percent): ");
            double commissionRate = Double.parseDouble(sc.nextLine().trim());

            System.out.print("commissionAmount (double): ");
            double commissionAmount = Double.parseDouble(sc.nextLine().trim());

            RealEstateRecord r = new RealEstateRecord(id, createdDate, updatedDate,
                    agencyName, location, phone,
                    agentName, agentEmail, licenseNumber,
                    propertyCode, propertyType, price,
                    sellerName, sellerContact,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    commissionRate, commissionAmount);

            if (!r.isValid()) {
                System.out.println(ID + " Validation errors:");
                for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
                return;
            }

            double comm = r.calculateCommission();
            System.out.println(ID + " --- Real Estate Record ---");
            System.out.print(r.getDetails());
            System.out.println(ID + " Calculated Commission: " + comm);

        } catch (Exception ex) {
            System.out.println(ID + " Error: " + ex.getMessage());
        }
    }
}
