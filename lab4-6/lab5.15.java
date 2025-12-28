import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class 5_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carModel = scanner.nextLine();
        double carRate = scanner.nextDouble();
        scanner.nextLine();

        String mcModel = scanner.nextLine();
        double mcRate = scanner.nextDouble();

        RentalVehicle[] vehicles = {
            new Car(carModel, carRate),
            new Motorcycle(mcModel, mcRate)
        };

        double totalRentalFee = 0;
        for (RentalVehicle v : vehicles) {
            totalRentalFee += v.calculateFee();
        }

        System.out.println("Total Rental Fee: " + totalRentalFee);
        scanner.close();
    }
}
