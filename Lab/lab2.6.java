package lab2;

import java.util.Scanner;

public class lab2_6 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Owner Name: ");
        String ownerName = scanner.nextLine(); 

        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble(); 
        
        System.out.print("Deposit Amount: ");
        double depositAmount = scanner.nextDouble(); 

        scanner.close(); 
                
        BankAccount account = new BankAccount(ownerName, initialBalance);

        account.deposit(depositAmount);
        
        account.displaySummary(); 
    }
}

class BankAccount {
    
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount; 
    }

    public void displaySummary() {
        System.out.println("Owner: " + ownerName); 
        System.out.printf("Balance: %.2f%n", balance);
    }
}
