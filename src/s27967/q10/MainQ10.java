package s27967.q10;

import java.util.Scanner;

public class MainQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter store id: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter created date: ");
        String createdDate = sc.nextLine().trim();
        System.out.print("Enter updated date: ");
        String updatedDate = sc.nextLine().trim();
        System.out.print("Enter store name: ");
        String storeName = sc.nextLine().trim();
        System.out.print("Enter store address: ");
        String addressStore = sc.nextLine().trim();
        System.out.print("Enter store email: ");
        String email = sc.nextLine().trim();

        System.out.print("Enter category name: ");
        String categoryName = sc.nextLine().trim();
        System.out.print("Enter category code: ");
        String categoryCode = sc.nextLine().trim();

        System.out.print("Enter product name: ");
        String productName = sc.nextLine().trim();
        System.out.print("Enter product code: ");
        String productCode = sc.nextLine().trim();
        System.out.print("Enter product price: ");
        double price = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine().trim();
        System.out.print("Enter contact number: ");
        String contactNumber = sc.nextLine().trim();
        System.out.print("Enter customer address: ");
        String customerAddress = sc.nextLine().trim();

        System.out.print("Enter order date: ");
        String orderDate = sc.nextLine().trim();
        System.out.print("Enter order id: ");
        String orderId = sc.nextLine().trim();

        System.out.print("Enter payment method: ");
        String paymentMethod = sc.nextLine().trim();
        System.out.print("Enter payment status: ");
        String paymentStatus = sc.nextLine().trim();

        System.out.print("Enter shipping address: ");
        String shippingAddress = sc.nextLine().trim();
        System.out.print("Enter shipping cost: ");
        double shippingCost = Double.parseDouble(sc.nextLine().trim());

        // compute totalAmount from price and shippingCost before validation
        double totalAmount = price + shippingCost;

        OrderRecord record = new OrderRecord(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost, totalAmount);

        if (!record.isValid()) {
            System.out.println("27967 Validation errors:");
            for (String err : record.getValidationErrors()) {
                System.out.println("27967 " + err);
            }
            return;
        }

        double total = record.calculateTotalAmount();
        System.out.println("27967 Order processed. Total amount: " + total);
        System.out.println("27967 \n" + record.getDetails());
    }
}
