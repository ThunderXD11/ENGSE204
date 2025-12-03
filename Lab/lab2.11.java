package lab2;

import java.util.Scanner;

public class lab2_11 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter Model: ");
        String inputModel = scanner.nextLine(); 

        System.out.print("Enter Initial Year: ");
        int initialYear = scanner.nextInt(); 

        System.out.print("Enter New Year: ");
        int newYear = scanner.nextInt(); 

        scanner.close(); 
                
        Car car = new Car(inputModel, initialYear);
        
        car.setYear(newYear);
        
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}

class Car {
    
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}
