package lab1;

import java.util.Scanner;

public class lab1_11 {

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter integer N (number of values): ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid N input.");
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        
        if (N <= 0) {
            System.out.println("N must be a positive integer.");
            scanner.close();
            return;
        }
        
        int[] numbers = new int[N];
        
        System.out.println("Please enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Skipping this number and setting to 0.");
                scanner.next(); // Consume invalid input
                numbers[i] = 0; // Set invalid input to 0
            }
        }
        
        int totalSum = sumArray(numbers);
        
        System.out.println("Result: " + totalSum);
        
        scanner.close();
    }
}
