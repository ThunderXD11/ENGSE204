package lab2;

import java.util.Scanner;

public class lab2_8 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter Mode : ");
        String mode = scanner.nextLine(); 

        System.out.print("Enter Temperature : ");
        double temperature = scanner.nextDouble(); 

        scanner.close(); 
        
        double result = 0.0;
        
        if (mode.equalsIgnoreCase("C_TO_F")) {
            result = TempConverter.celsiusToFahrenheit(temperature); 
        } 
        else if (mode.equalsIgnoreCase("F_TO_C")) {
            result = TempConverter.fahrenheitToCelsius(temperature);
        } else {
            System.out.println("Invalid mode entered.");
            return;
        }

        System.out.println(result);
    }
}

class TempConverter {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
