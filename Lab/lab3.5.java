package lab3;

import java.util.Scanner;

class DatabaseConnection {

    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        if (!this.connected) {
            this.connected = true;
            System.out.println("Connected to " + this.connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (this.connected) {
            this.connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class lab3_5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            String inputString = sc.nextLine();
            
            DatabaseConnection db = new DatabaseConnection(inputString);
            
            db.connect(); 
            
            db.disconnect(); 
            
            db.disconnect(); 
            
            System.out.println(db.isConnected());
        }
    }
}
