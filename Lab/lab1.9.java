package lab1;

import java.util.Scanner;

public class lab19 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ป้อนจำนวนเต็ม N (จำนวนตัวเลขที่ต้องการหาค่าเฉลี่ย): ");
	        
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
	        
	        int[] numbers = new int[N];
	        
	        readNumbersIntoArray(N, numbers, scanner);
	        
	        double average = calculateAverage(numbers);
	        
	        System.out.printf("ผลลัพธ์: %.1f%n", average);
	        
	        scanner.close();
	    }

	    public static void readNumbersIntoArray(int N, int[] array, Scanner scanner) {
	        System.out.println("กรุณาป้อนตัวเลข " + N + " จำนวน:");
	        for (int i = 0; i < N; i++) {
	            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
	            if (scanner.hasNextInt()) {
	                array[i] = scanner.nextInt();
	            } else {
	                System.out.println("อินพุตไม่ถูกต้อง ข้ามตัวเลขนี้");
	                scanner.next(); 
	                array[i] = 0;
	            }
	        }
	    }

	    public static double calculateAverage(int[] array) {
	        if (array.length == 0) {
	            return 0.0;
	        }
	        
	        long sum = 0;
	        for (int number : array) {
	            sum += number;
	        }
	        
	        return (double) sum / array.length;
	    }
	}
