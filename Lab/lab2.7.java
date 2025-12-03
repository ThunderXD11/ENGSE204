package lab2;

import java.util.Scanner;

public class lab2_7 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Owner Name: ");
        String ownerName = scanner.nextLine(); 

        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble(); 
        
        System.out.print("Withdrawal Amount 1: ");
        double withdrawAmount1 = scanner.nextDouble(); 

        System.out.print("Withdrawal Amount 2: ");
        double withdrawAmount2 = scanner.nextDouble(); 

        scanner.close(); 
                
        BankAccount1 account = new BankAccount1(ownerName, initialBalance);

        account.withdraw(withdrawAmount1); 
        account.withdraw(withdrawAmount2);
        
        account.displayBalance(); 
    }
}

class BankAccount1 {
    
    private String ownerName;
    private double balance;

    public BankAccount1(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance); 
    }
}
