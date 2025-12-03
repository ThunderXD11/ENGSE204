package lab1;

import java.util.Scanner;

public class lab1_14 {

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

        System.out.print("Enter number of rows R: ");
        int R = scanner.nextInt();
        System.out.print("Enter number of columns C: ");
        int C = scanner.nextInt();
        scanner.nextLine();

        char[][] map = new char[R][C];

        System.out.println("Enter the map " + R + "x" + C + " (use '*' for mine, '.' for empty):");
        for (int i = 0; i < R; i++) {
            System.out.print("Enter row " + (i + 1) + ": ");
            String line = scanner.nextLine();
            
            if (line.length() == C) {
                map[i] = line.toCharArray();
            } else {
                System.out.println("Incorrect column length. Please re-enter.");
                i--;
            }
        }

        System.out.print("Enter target coordinates (targetR, targetC) - Row index: ");
        int targetR = scanner.nextInt();
        System.out.print("Enter target coordinates (targetR, targetC) - Column index: ");
        int targetC = scanner.nextInt();
        
        if (map[targetR][targetC] == '*') {
            System.out.println("Result: Mine");
        } 
        else {
            int result = checkTarget(map, targetR, targetC);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
