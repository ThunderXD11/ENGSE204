package lab1;

import java.util.Scanner;

public class lab16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer (Multiplier): ");

        if (scanner.hasNextInt()) {
            int multiplier = scanner.nextInt();
            
            generateMultiplicationTable(multiplier);
        } else {
            System.out.println("Invalid input. Please enter an integer only.");
        }

        scanner.close();
    }

    public static void generateMultiplicationTable(int multiplier) {
        for (int i = 1; i <= 12; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}
