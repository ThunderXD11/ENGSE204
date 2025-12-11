package lab3;

import java.util.Scanner;

class BankAccount2 {
    private double balance;

    private static int totalTransactionCount = 0;

    public BankAccount2(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }

        totalTransactionCount++;
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } 
        else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } 
        else if (amount > 0 && amount > this.balance) {
            System.out.println("Insufficient funds.");
        } 
        else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class lab3_14 {
    public static void main(String[] args) {
        BankAccount2 myAccount = null;
        
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
        }
        
        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];
            double amount = 0;
            if (parts.length > 1) {
                try {
                    amount = Double.parseDouble(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid amount format for command: " + command);
                    continue; 
                }
            }

            switch (command) {
                case "CREATE":
                    if (myAccount == null) {
                        myAccount = new BankAccount2(amount);
                    } else {
                        System.out.println("Error: Account already exists.");
                    }
                    break;
                
                case "DEPOSIT":
                case "WITHDRAW":
                    if (myAccount != null) {
                        if (command.equals("DEPOSIT")) {
                            myAccount.deposit(amount);
                        } else { 
                            myAccount.withdraw(amount);
                        }
                    } 
                    else {
                        System.out.println("No account exists.");
                    }
                    break;
                
                case "STATUS":
                    if (myAccount != null) {
                        System.out.println("Balance: " + myAccount.getBalance());
                    } 
                    else {
                        System.out.println("No account exists.");
                    }
                    break;
                
                case "GLOBAL_STATUS":
                    System.out.println("Total Transactions: " + BankAccount2.getTotalTransactionCount());
                    break;
                
                default:
                    System.out.println("Error: Unknown command.");
                    break;
            }
        }
        
        scanner.close();
    }
}
