package lab1;

import java.util.Scanner;

public class lab1_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of product types N: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid N input.");
            scanner.close();
            return;
        }

        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N must be a positive integer.");
            scanner.close();
            return;
        }

        int[] productIDs = new int[N];
        int[] stockQuantities = new int[N];

        System.out.println("Please enter data for " + N + " product types:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter Product ID (item " + (i + 1) + "): ");
            if (scanner.hasNextInt()) {
                productIDs[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid Product ID. Skipping data entry for this item.");
                scanner.next(); 
                i--; 
                continue;
            }

            System.out.print("Enter Stock Quantity (item " + (i + 1) + "): ");
            if (scanner.hasNextInt()) {
                stockQuantities[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid Stock Quantity. Skipping data entry for this item.");
                scanner.next(); 
                i--; 
            }
        }

        System.out.print("Enter the product ID to search (Search ID): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid Search ID input.");
            scanner.close();
            return;
        }
        int searchID = scanner.nextInt();

        findStock(productIDs, stockQuantities, searchID);

        scanner.close();
    }

    public static void findStock(int[] ids, int[] stocks, int searchID) {
        boolean found = false;

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == searchID) {
                System.out.println(stocks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product [" + searchID + "] not found");
        }
    }
}
