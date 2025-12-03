package lab1;

import java.util.Scanner;

public class lab1_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter integer N (number of values to compare): ");
        
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
        
        readNumbersIntoArray(N, numbers, scanner);
        
        int maxValue = findMaximum(numbers);
        
        System.out.println("Result: " + maxValue);
        
        scanner.close();
    }

    public static void readNumbersIntoArray(int N, int[] array, Scanner scanner) {
        System.out.println("Please enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please restart the input process.");
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
