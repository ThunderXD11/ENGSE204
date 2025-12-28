package lab5;

import java.util.Scanner;

class Shape {
    protected String name;

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width, height;

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class lab5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        Circle circle = new Circle("Circle", r);
        Rectangle rect = new Rectangle("Rectangle", w, h);

        Shape[] shapes = {circle, rect};

        for (Shape s : shapes) {
            System.out.println(s.name + " Area: " + s.calculateArea());
        }

        sc.close();
    }
}
