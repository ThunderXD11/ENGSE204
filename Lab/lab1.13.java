package lab1;

import java.util.Scanner;

public class lab113 {

	    public static int countOnlineServers(int R, int C, Scanner scanner) {
	        int[][] grid = new int[R][C];
	        int onlineCount = 0;

	        System.out.println("ป้อนสถานะเซิร์ฟเวอร์ R*C ตัว (0 หรือ 1):");

	        for (int i = 0; i < R; i++) {
	            for (int j = 0; j < C; j++) {
	                if (scanner.hasNextInt()) {
	                    grid[i][j] = scanner.nextInt();
	                    if (grid[i][j] == 1) {
	                        onlineCount++;
	                    }
	                } else {
	                    System.out.println("อินพุตไม่ถูกต้อง กรุณาป้อน 0 หรือ 1 เท่านั้น");
	                    scanner.next(); 
	                    j--; 
	                }
	            }
	        }
	        
	        return onlineCount;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("ป้อนจำนวนแถว R: ");
	        if (!scanner.hasNextInt()) {
	            System.out.println("R ไม่ถูกต้อง");
	            scanner.close();
	            return;
	        }
	        int R = scanner.nextInt();

	        System.out.print("ป้อนจำนวนคอลัมน์ C: ");
	        if (!scanner.hasNextInt()) {
	            System.out.println("C ไม่ถูกต้อง");
	            scanner.close();
	            return;
	        }
	        int C = scanner.nextInt();
	        
	        if (R <= 0 || C <= 0) {
	            System.out.println("R และ C ต้องเป็นจำนวนเต็มบวก");
	            scanner.close();
	            return;
	        }

	        int result = countOnlineServers(R, C, scanner);
	        
	        System.out.println("ผลลัพธ์: " + result);

	        scanner.close();
	    }
	}
