import java.util.Scanner;

// Class 1: Superclass
class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

// Class 2: Subclass PhysicalProduct
class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

// Class 3: Subclass DigitalSubscription
class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for PhysicalProduct
        String physicalName = sc.nextLine();
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        sc.nextLine(); 

        String digitalName = sc.nextLine();
        double monthlyCost = sc.nextDouble();
        int months = sc.nextInt();

        PhysicalProduct physical = new PhysicalProduct(
                physicalName, unitPrice, quantity);
        DigitalSubscription digital = new DigitalSubscription(
                digitalName, monthlyCost, months);

        Item[] items = new Item[2];
        items[0] = physical;
        items[1] = digital;

        double totalValue = 0.0;
        for (Item item : items) {
            totalValue += item.getValue();
        }

        System.out.println("Total Value: " + totalValue);

        sc.close();
    }
}
