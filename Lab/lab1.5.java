package lab1;

import java.util.Scanner;

public class lab1_5 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Drink Menu ---");
        System.out.println("1 = Americano");
        System.out.println("2 = Latte");
        System.out.println("3 = Espresso");
        System.out.println("4 = Mocha");
        System.out.print("Please enter the menu number (1-4): ");

        if (scanner.hasNextInt()) {
            int menuNumber = scanner.nextInt();
            
            String menuName = selectMenu(menuNumber);
            System.out.println("Result: " + menuName);
        } else {
            System.out.println("Result: Invalid Menu");
        }

        scanner.close();
    }

    public static String selectMenu(int menuNumber) {
        String result;
        
        switch (menuNumber) {
            case 1:
                result = "Americano";
                break;
            case 2:
                result = "Latte";
                break;
            case 3:
                result = "Espresso";
                break;
            case 4:
                result = "Mocha";
                break;
            default:
                result = "Invalid Menu";
                break;
        }
        
        return result;
    }
}
