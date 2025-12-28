package lab5;

import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String basicName = sc.nextLine();
        double basicPrice = sc.nextDouble();
        sc.nextLine();

        String premiumName = sc.nextLine();
        double premiumPrice = sc.nextDouble();
        double premiumRate = sc.nextDouble();

        Service basic = new BasicService(basicName, basicPrice);
        Service premium = new PremiumService(premiumName, premiumPrice, premiumRate);

        Service[] services = { basic, premium };

        for (Service s : services) {
            System.out.println(s.name + " Final Price: " + s.calculateFinalPrice());
        }

        sc.close();
    }
}
