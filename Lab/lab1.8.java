package lab1;

import java.util.Scanner;

public class lab18 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ป้อนจำนวนเต็ม N (จำนวนตัวเลขที่ต้องการเปรียบเทียบ): ");
	        
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
	        
	        int maxValue = findMaximum(numbers);
	        
	        System.out.println("ผลลัพธ์: " + maxValue);
	        
	        scanner.close();
	    }

	    public static void readNumbersIntoArray(int N, int[] array, Scanner scanner) {
	        System.out.println("กรุณาป้อนตัวเลข " + N + " จำนวน:");
	        for (int i = 0; i < N; i++) {
	            System.out.print("ป้อนตัวเลขที่ " + (i + 1) + ": ");
	            if (scanner.hasNextInt()) {
	                array[i] = scanner.nextInt();
	            } else {
	                System.out.println("อินพุตไม่ถูกต้อง กรุณาเริ่มต้นใหม่");
	                // ในกรณีนี้ เราเลือกหยุดโปรแกรมหรือจัดการกับอินพุตที่ไม่ถูกต้อง แต่เพื่อให้โค้ดรันต่อได้ง่าย 
	                // เราจะอ่าน token ที่ไม่ใช่ int ทิ้งไปแล้ววนซ้ำในลูปถัดไป (แต่ในโจทย์นี้จะสันนิษฐานว่าผู้ใช้ป้อนถูกต้อง)
	                scanner.next(); 
	            }
	        }
	    }

	    public static int findMaximum(int[] array) {
	        if (array.length == 0) {
	            return Integer.MIN_VALUE; 
	        }
	        
	        int max = array[0];
	        
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        
	        return max;
	    }
	}
