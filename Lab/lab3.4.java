package lab3;

import java.util.Scanner;

class Product {

    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class lab3_4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            int N = sc.nextInt();
            sc.nextLine(); 

            for (int i = 0; i < N; i++) {
                String productName = sc.nextLine();
                new Product(productName); 
            }

            System.out.println(Product.getProductCount()); 
        }
    }
}
