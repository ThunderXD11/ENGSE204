package lab1;

import java.util.Scanner;

public class lab111 {

	    public static int sumArray(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ป้อนจำนวนเต็ม N (จำนวนตัวเลข): ");
	        
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
	        
	        System.out.println("กรุณาป้อนตัวเลข " + N + " จำนวน:");
	        for (int i = 0; i < N; i++) {
	            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
	            if (scanner.hasNextInt()) {
	                numbers[i] = scanner.nextInt();
	            } else {
	                System.out.println("อินพุตไม่ถูกต้อง ข้ามตัวเลขนี้");
	                scanner.next(); 
	                numbers[i] = 0; 
	            }
	        }
	        
	        int totalSum = sumArray(numbers);
	        
	        System.out.println("ผลลัพธ์: " + totalSum);
	        
	        scanner.close();
	    }
	}
