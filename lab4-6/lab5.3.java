package lab5;

import java.util.Scanner;

class Employee {

    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {

    	double baseBonus = super.calculateBonus();
    	
        double extraBonus = salary * 0.05;
        
        return baseBonus + extraBonus;
    }
}

public class lab5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        Manager manager = new Manager();

        manager.salary = salary;

        double bonus = manager.calculateBonus();
        System.out.println(bonus);

        sc.close();
    }
}
