package lab5;

import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee) {
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sId = sc.nextLine();
        double sBaseFee = sc.nextDouble();
        sc.nextLine();

        String pId = sc.nextLine();
        double pBaseFee = sc.nextDouble();
        double pInsuranceFee = sc.nextDouble();

        Shipping s1 = new StandardShipping(sId, sBaseFee);
        Shipping s2 = new PremiumShipping(pId, pBaseFee, pInsuranceFee);

        Shipping[] shipments = {s1, s2};

        for (Shipping s : shipments) {
            System.out.println(
                "ID: " + s.trackingId +
                " | Total Fee: " + s.calculateTotalFee()
            );
        }

        sc.close();
    }
}
