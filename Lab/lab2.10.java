package lab2;

import java.util.Scanner;

public class lab2_10 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter number of products : ");
        int N = scanner.nextInt(); 
        scanner.nextLine(); 

        ShoppingCart cart = new ShoppingCart();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine(); 

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble(); 
            scanner.nextLine(); 

            Product product = new Product(name, price);
            
            cart.addProduct(product);
        }

        scanner.close(); 
                
        System.out.println(cart.calculateTotalPrice());
    }
}

class Product {
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    
    private Product[] items = new Product[10]; 
    private int itemCount = 0; 

    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++; 
        } else {
            System.out.println("Cart is full.");
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        
        return total;
    }
}
