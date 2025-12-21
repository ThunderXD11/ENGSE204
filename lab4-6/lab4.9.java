package lab4;

import java.util.Scanner;

class ImmutableAccount {
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = (balance < 0) ? 0.0 : balance;
    }

    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    public String getAccountId() { return accountId; }
    public double getBalance() { return balance; }

    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(this.accountId, this.balance + amount);
        } else {
            System.out.println("Invalid deposit amount.");
            return this; 
        }
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
            return this;
        } else {
            return new ImmutableAccount(this.accountId, this.balance - amount);
        }
    }
}

public class lab4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = sc.next();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Enter Deposit Amount: ");
        double depositAmt = sc.nextDouble();
        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmt = sc.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);

        ImmutableAccount acc2 = acc1.deposit(depositAmt);

        ImmutableAccount acc3 = acc2.withdraw(withdrawAmt);

        System.out.println("--- Final Results ---");
        acc1.displayInfo(); 
        acc3.displayInfo(); 

        sc.close();
    }
}
