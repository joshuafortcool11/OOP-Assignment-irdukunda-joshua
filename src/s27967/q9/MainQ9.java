package s27967.q9;

import java.util.Scanner;

public class MainQ9 {
    private static final String ID = "27967";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(ID + " Enter airline ticketing details (press Enter after each):");

            System.out.print("id (int): ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("createdDate: ");
            String createdDate = sc.nextLine().trim();

            System.out.print("updatedDate: ");
            String updatedDate = sc.nextLine().trim();

            System.out.print("airlineName: ");
            String airlineName = sc.nextLine().trim();

            System.out.print("address: ");
            String address = sc.nextLine().trim();

            System.out.print("contactEmail: ");
            String contactEmail = sc.nextLine().trim();

            System.out.print("flightNumber: ");
            String flightNumber = sc.nextLine().trim();

            System.out.print("destination: ");
            String destination = sc.nextLine().trim();

            System.out.print("departureTime: ");
            String departureTime = sc.nextLine().trim();

            System.out.print("passengerName: ");
            String passengerName = sc.nextLine().trim();

            System.out.print("passportNumber: ");
            String passportNumber = sc.nextLine().trim();

            System.out.print("nationality: ");
            String nationality = sc.nextLine().trim();

            System.out.print("seatNumber: ");
            String seatNumber = sc.nextLine().trim();

            System.out.print("seatType (Economy/Business): ");
            String seatType = sc.nextLine().trim();

            System.out.print("ticketNumber: ");
            String ticketNumber = sc.nextLine().trim();

            System.out.print("price (double): ");
            double price = Double.parseDouble(sc.nextLine().trim());

            System.out.print("baggageWeight (double): ");
            double baggageWeight = Double.parseDouble(sc.nextLine().trim());

            System.out.print("baggageFee (double): ");
            double baggageFee = Double.parseDouble(sc.nextLine().trim());

            System.out.print("paymentDate: ");
            String paymentDate = sc.nextLine().trim();

            System.out.print("paymentMode: ");
            String paymentMode = sc.nextLine().trim();

            // compute totalFare from price and baggageFee
            double totalFare = price + baggageFee;

                TicketRecord r = new TicketRecord(id, createdDate, updatedDate,
                    airlineName, address, contactEmail,
                    flightNumber, destination, departureTime,
                    passengerName, passportNumber, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode,
                    totalFare
                );

            if (!r.isValid()) {
                System.out.println(ID + " Validation errors:");
                for (String err : r.getValidationErrors()) System.out.println(ID + " " + err);
                return;
            }

            double total = r.generateInvoice();
            System.out.println(ID + " --- Ticket Record ---");
            System.out.print(r.getDetails());
            System.out.println(ID + " Generated Invoice Total Fare: " + total);

        } catch (Exception ex) {
            System.out.println(ID + " Error: " + ex.getMessage());
        }
    }
}
