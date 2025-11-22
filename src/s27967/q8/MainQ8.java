package s27967.q8;

import java.util.Scanner;

public class MainQ8 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(ID + " Enter library record details (press Enter after each):");

            System.out.print("id (int): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("createdDate: ");
            String createdDate = sc.nextLine().trim();

            System.out.print("updatedDate: ");
            String updatedDate = sc.nextLine().trim();

            System.out.print("libraryName: ");
            String libraryName = sc.nextLine().trim();

            System.out.print("location: ");
            String location = sc.nextLine().trim();

            System.out.print("phoneNumber (10 digits): ");
            String phone = sc.nextLine().trim();

            System.out.print("sectionName: ");
            String sectionName = sc.nextLine().trim();

            System.out.print("sectionCode: ");
            String sectionCode = sc.nextLine().trim();

            System.out.print("title: ");
            String title = sc.nextLine().trim();

            System.out.print("author: ");
            String author = sc.nextLine().trim();

            System.out.print("ISBN: ");
            String isbn = sc.nextLine().trim();

            System.out.print("memberName: ");
            String memberName = sc.nextLine().trim();

            System.out.print("memberId (int): ");
            int memberId = Integer.parseInt(sc.nextLine().trim());

            System.out.print("contactNumber: ");
            String contactNumber = sc.nextLine().trim();

            System.out.print("borrowDate: ");
            String borrowDate = sc.nextLine().trim();

            System.out.print("returnDate: ");
            String returnDate = sc.nextLine().trim();

            System.out.print("fineAmount (double): ");
            double fineAmount = Double.parseDouble(sc.nextLine().trim());

            System.out.print("daysLate (int): ");
            int daysLate = Integer.parseInt(sc.nextLine().trim());

            System.out.print("paymentDate: ");
            String paymentDate = sc.nextLine().trim();

            System.out.print("paymentMode: ");
            String paymentMode = sc.nextLine().trim();

            // compute totalFine from fineAmount and daysLate
            double totalFine = fineAmount * daysLate;

                LibraryRecord r = new LibraryRecord(id, createdDate, updatedDate,
                    libraryName, location, phone,
                    sectionName, sectionCode,
                    title, author, isbn,
                    memberName, memberId, contactNumber,
                    borrowDate, returnDate,
                    fineAmount, daysLate,
                    paymentDate, paymentMode,
                    totalFine
                );

            if (!r.isValid()) {
                System.out.println(ID + " Validation errors:");
                for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
                return;
            }

            double total = r.calculateFine();
            System.out.println(ID + " --- Library Record ---");
            System.out.print(r.getDetails());
            System.out.println(ID + " Calculated Total Fine: " + total);

        } catch (Exception ex) {
            System.out.println(ID + " Error: " + ex.getMessage());
        }
    }
}
