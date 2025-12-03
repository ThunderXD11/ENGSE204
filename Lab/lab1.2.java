package lab1;

import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter Height: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("Area: " + area);
        
        scanner.close();
    }
}
