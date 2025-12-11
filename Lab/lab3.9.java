package lab3;

import java.util.Scanner;

class User1 {

    private final String username1;
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

    public User1(String username, String password) {
        this.username1 = username;
        
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

public class lab3_9 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int minLength1 = sc.nextInt();
            sc.nextLine(); 

            String user1_name = sc.nextLine();
            String user1_pass = sc.nextLine();

            String user2_name = sc.nextLine();
            String user2_pass = sc.nextLine();

            int minLength2 = sc.nextInt();
            sc.nextLine(); 

            String user2_newPass = sc.nextLine();

            User1.setMinLength(minLength1);

            User1 user1 = new User1(user1_name, user1_pass);

            User1 user2 = new User1(user2_name, user2_pass);

            User1.setMinLength(minLength2);
            user2.setPassword(user2_newPass);
            
            System.out.println(user1.getPassword());

            System.out.println(user2.getPassword());
        }
    }
}
