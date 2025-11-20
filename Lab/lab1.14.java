package lab1;

import java.util.Scanner;

public class lab114 {

	    public static int checkTarget(char[][] map, int targetR, int targetC) {
	        int R = map.length;
	        int C = map[0].length;
	        int mineCount = 0;

	        for (int dr = -1; dr <= 1; dr++) {
	            for (int dc = -1; dc <= 1; dc++) {
	                if (dr == 0 && dc == 0) {
	                    continue;
	                }

	                int newR = targetR + dr;
	                int newC = targetC + dc;

	                if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
	                    if (map[newR][newC] == '*') {
	                        mineCount++;
	                    }
	                }
	            }
	        }

	        return mineCount;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("ป้อนจำนวนแถว R: ");
	        int R = scanner.nextInt();
	        System.out.print("ป้อนจำนวนคอลัมน์ C: ");
	        int C = scanner.nextInt();
	        scanner.nextLine();

	        char[][] map = new char[R][C];

	        System.out.println("ป้อนแผนที่ " + R + "x" + C + " (ใช้ '*' สำหรับระเบิด, '.' สำหรับช่องว่าง):");
	        for (int i = 0; i < R; i++) {
	            System.out.print("ป้อนแถวที่ " + (i + 1) + ": ");
	            String line = scanner.nextLine();
	            if (line.length() == C) {
	                map[i] = line.toCharArray();
	            } else {
	                System.out.println("ความยาวคอลัมน์ไม่ถูกต้อง กรุณาป้อนใหม่");
	                i--;
	            }
	        }

	        System.out.print("ป้อนพิกัดเป้าหมาย (targetR, targetC) - แถว: ");
	        int targetR = scanner.nextInt();
	        System.out.print("ป้อนพิกัดเป้าหมาย (targetR, targetC) - คอลัมน์: ");
	        int targetC = scanner.nextInt();
	        
	        if (map[targetR][targetC] == '*') {
	            System.out.println("ผลลัพธ์: Mine");
	        } 
	        else {
	            int result = checkTarget(map, targetR, targetC);
	            System.out.println("ผลลัพธ์: " + result);
	        }

	        scanner.close();
	    }
	}
