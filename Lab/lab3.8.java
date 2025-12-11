package lab3;

import java.util.Scanner;

class InventoryItem {

    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Not enough stock.");
        }
    }
}

public class lab3_8 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            String name = sc.nextLine();
            
            int initialStock = sc.nextInt();
            
            int N = sc.nextInt();
            sc.nextLine(); 
            
            InventoryItem item = new InventoryItem(name, initialStock);
            
            for (int i = 0; i < N; i++) {
                String type = sc.nextLine();
                
                int amount = sc.nextInt();
                sc.nextLine(); 
                
                if (type.equalsIgnoreCase("ADD")) {
                    item.addStock(amount);
                } else if (type.equalsIgnoreCase("SELL")) {
                    item.sellStock(amount);
                }
            }

            System.out.println("Final Stock: " + item.getStock());
        }
    }
}
