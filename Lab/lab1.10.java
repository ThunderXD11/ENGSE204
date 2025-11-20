package lab1;

import java.util.Scanner;

public class lab110 {

	    public static double calculateArea(double width, double height) {
	        return width * height;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ป้อนความกว้าง (width) เป็นทศนิยม: ");
	        
	        if (!scanner.hasNextDouble()) {
	            System.out.println("อินพุตความกว้างไม่ถูกต้อง");
	            scanner.close();
	            return;
	        }
	        double width = scanner.nextDouble();
	        
	        System.out.print("ป้อนความสูง (height) เป็นทศนิยม: ");
	        
	        if (!scanner.hasNextDouble()) {
	            System.out.println("อินพุตความสูงไม่ถูกต้อง");
	            scanner.close();
	            return;
	        }
	        double height = scanner.nextDouble();
	        
	        double area = calculateArea(width, height);
	        
	        System.out.printf("ผลลัพธ์: %.1f%n", area);
	        
	        scanner.close();
	    }
	}
