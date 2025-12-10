package lab3;

import java.util.Scanner;

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
}

public class lab3_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("(Username): ");
        
        String testInput = scanner.nextLine();
        
        scanner.close();
        
        User userInstance = new User(testInput);

        System.out.println("\nUsername:");
        System.out.println(userInstance.getUsername());
        
    }
}
