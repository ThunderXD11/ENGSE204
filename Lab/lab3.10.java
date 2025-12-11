package lab3;

import java.util.Scanner;

class User2 {

    private final String username;
    private String password;
    private static int minPasswordLength = 8;

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to [" + length + "]");
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }

    public User2(String username, String password) {
        this.username = username;
        
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "Invalid";
            System.out.println("Creation failed.");
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }
}

public class lab3_10 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Read 7 inputs
            int minLength1 = sc.nextInt();
            sc.nextLine(); 

            String user1_name = sc.nextLine();
            String user1_pass = sc.nextLine();

            String user2_name = sc.nextLine();
            String user2_pass = sc.nextLine();

            int minLength2 = sc.nextInt();
            sc.nextLine(); 

            String user2_newPass = sc.nextLine();

            User2.setMinLength(minLength1);

            User2 user1 = new User2(user1_name, user1_pass);

            User2 user2 = new User2(user2_name, user2_pass);

            User2.setMinLength(minLength2);

            user2.setPassword(user2_newPass);
            
            System.out.println(user1.getPassword());

            System.out.println(user2.getPassword());
        }
    }
}
