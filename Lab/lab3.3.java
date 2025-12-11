package lab3;

import java.util.Scanner;

class PasswordManager {

    private String password;

    public PasswordManager(String initialPassword) {
        this.password = initialPassword;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

public class lab3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String initialPassword = sc.next();
        String newPassword = sc.next();
        
        sc.close();

        PasswordManager user = new PasswordManager(initialPassword);

        user.setPassword(newPassword);

        System.out.println(user.getPassword());
    }
}
