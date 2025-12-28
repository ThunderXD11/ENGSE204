package lab5;

import java.util.Scanner;

class Vehicle {
 protected String color;

 public Vehicle(String color) {
     this.color = color;
 }
}

class Car extends Vehicle {
 protected int wheels;

 public Car(String color, int wheels) {
     super(color);
     this.wheels = wheels;
 }

 public void displayDetails() {
     System.out.println("Color: " + color + ", Wheels: " + wheels);
 }
}

public class lab5_4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("");
     String inputColor = sc.nextLine();
     
     System.out.print("");
     int inputWheels = sc.nextInt();

     Car myCar = new Car(inputColor, inputWheels);

     myCar.displayDetails();

     sc.close();
 }
}
