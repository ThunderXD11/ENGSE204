package lab3;

import java.util.Scanner;

class Employee1 {

    private String name;
    private double monthlySalary;

    public Employee1(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }
}

public class lab3_12 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            String name = sc.nextLine();
            double monthlySalary = sc.nextDouble();
            double taxRate = sc.nextDouble();
            double raiseAmount = sc.nextDouble();
            sc.nextLine(); 

            Employee1 emp = new Employee1(name, monthlySalary);

            double taxBefore = emp.calculateTax(taxRate);
            System.out.printf("Tax (Before): %.2f\n", taxBefore);

            emp.giveRaise(raiseAmount);

            double taxAfter = emp.calculateTax(taxRate);
            System.out.printf("Tax (After): %.2f\n", taxAfter);

        } catch (Exception e) {
            
        }
    }
}
