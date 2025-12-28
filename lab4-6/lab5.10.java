

import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String desc, int hours) {
        this.description = desc;
        this.baseHours = hours;
    }

    public double calculateCost() {

      return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String desc, int hours, double fee) {

      super(desc, hours);
        this.setupFee = fee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String desc, int hours) {
        super(desc, hours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter ComplexTask Data ---");
        System.out.print("Description: ");
        String compDesc = sc.nextLine();
        System.out.print("Base Hours: ");
        int compHours = sc.nextInt();
        System.out.print("Setup Fee: ");
        double compFee = sc.nextDouble();
        sc.nextLine();

        System.out.println("\n--- Enter SimpleTask Data ---");
        System.out.print("Description: ");
        String simpleDesc = sc.nextLine();
        System.out.print("Base Hours: ");
        int simpleHours = sc.nextInt();

        ComplexTask complex = new ComplexTask(compDesc, compHours, compFee);
        SimpleTask simple = new SimpleTask(simpleDesc, simpleHours);

        ProjectTask[] tasks = {complex, simple};

        System.out.println("\n--- Project Task Costs ---");
        for (ProjectTask task : tasks) {
            System.out.println("Task: " + task.description + 
                               " | Total Cost: " + task.calculateCost());
        }

        sc.close();
    }
}
