package lab1;

import java.util.Scanner;

public class lab13 {
	 public static void main(String[] args) {
		         Scanner scanner = new Scanner(System.in);

		         System.out.print("ป้อนจำนวนเต็ม 1 จำนวน: ");
		         
		         if (scanner.hasNextInt()) {
		             int number = scanner.nextInt();
		             
		             String result = checkEvenOrOdd(number);
		             System.out.println("ผลลัพธ์: " + result);

		         } else {
		             System.out.println("อินพุตไม่ถูกต้อง กรุณาป้อนจำนวนเต็มเท่านั้น");
		         }
		         
		         scanner.close();
		     }

		     public static String checkEvenOrOdd(int number) {
		         if (number % 2 == 0) {
		             return "Even";
		         } 
		         else {
		             return "Odd";
		         }
		     }
		 }
