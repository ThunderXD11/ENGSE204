package lab2;

import java.util.Scanner;

public class lab2_5 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Width : ");
        double inputWidth = scanner.nextDouble(); 

        System.out.print("Height : ");
        double inputHeight = scanner.nextDouble(); 

        scanner.close(); 
                
        Rectangle rect = new Rectangle(inputWidth, inputHeight);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
    }
}

class Rectangle {
    
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height; 
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
