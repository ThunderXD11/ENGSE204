package lab3;

import java.util.Scanner;

class User6 {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User6(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
        } else {
            System.out.println("Invalid Policy.");
        }
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public int getFailedAttempts() {
        return this.failedAttempts;
    }

    public void login(String password) {
        if (this.isLocked) {
            System.out.println("Login failed. Account is locked.");
            return;
        }

        if ("pass123".equals(password)) {
            this.failedAttempts = 0;
            this.isLocked = false;
            System.out.println("Login successful.");
        } else {
            this.failedAttempts++;
            int remaining = maxAttempts - this.failedAttempts;

            if (this.failedAttempts >= maxAttempts) {
                this.isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                System.out.println("Login failed. " + remaining + " attempts left.");
            }
        }
    }
}

public class lab3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.next();
        
        int max = scanner.nextInt();
        User6.setPolicy(max);
        
        User6 user = new User6(username);
        
        while (scanner.hasNext()) {
            String command = scanner.next();
            
            if (command.equals("LOGIN")) {
                if (scanner.hasNext()) {
                    String password = scanner.next();
                    user.login(password);
                }
            } else {
                break; 
            }
        }
        
        scanner.close();
    }
}
