package lab1;

import java.util.Scanner;

public class lab112 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("ป้อนจำนวนชนิดสินค้าทั้งหมด N: ");

	        if (!scanner.hasNextInt()) {
	            System.out.println("อินพุต N ไม่ถูกต้อง");
	            scanner.close();
	            return;
	        }

	        int N = scanner.nextInt();

	        if (N <= 0) {
	            System.out.println("N ต้องเป็นจำนวนเต็มบวก");
	            scanner.close();
	            return;
	        }

	        int[] productIDs = new int[N];
	        int[] stockQuantities = new int[N];

	        System.out.println("กรุณาป้อนข้อมูลสินค้า " + N + " ชนิด:");
	        for (int i = 0; i < N; i++) {
	            System.out.print("ป้อน Product ID (ชิ้นที่ " + (i + 1) + "): ");
	            if (scanner.hasNextInt()) {
	                productIDs[i] = scanner.nextInt();
	            } else {
	                System.out.println("Product ID ไม่ถูกต้อง ข้ามการป้อนข้อมูล");
	                scanner.next();
	                i--;
	                continue;
	            }

	            System.out.print("ป้อน Stock Quantity (ชิ้นที่ " + (i + 1) + "): ");
	            if (scanner.hasNextInt()) {
	                stockQuantities[i] = scanner.nextInt();
	            } else {
	                System.out.println("Stock Quantity ไม่ถูกต้อง ข้ามการป้อนข้อมูล");
	                scanner.next();
	                i--;
	            }
	        }

	        System.out.print("ป้อนรหัสสินค้าที่ต้องการค้นหา (Search ID): ");
	        if (!scanner.hasNextInt()) {
	            System.out.println("Search ID ไม่ถูกต้อง");
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
