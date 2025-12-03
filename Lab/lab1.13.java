package lab1;

import java.util.Scanner;

public class lab1_13 {

    public static int countOnlineServers(int R, int C, Scanner scanner) {
        int[][] grid = new int[R][C];
        int onlineCount = 0;

        System.out.println("Enter the status of R*C servers (0 or 1):");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (scanner.hasNextInt()) {
                    int status = scanner.nextInt();
                    if (status == 0 || status == 1) {
                        grid[i][j] = status;
                        if (status == 1) {
                            onlineCount++;
                        }
                    } else {
                        System.out.println("Invalid input. Please enter only 0 or 1.");
                        j--;
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); 
                    j--; 
                }
            }
        }
        
        return onlineCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows R: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid R input.");
            scanner.close();
            return;
        }
        int R = scanner.nextInt();

        System.out.print("Enter number of columns C: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid C input.");
            scanner.close();
            return;
        }
        int C = scanner.nextInt();
        
        if (R <= 0 || C <= 0) {
            System.out.println("R and C must be positive integers.");
            scanner.close();
            return;
        }

        int result = countOnlineServers(R, C, scanner);
        
        System.out.println("Result: " + result);

        scanner.close();
    }
}
