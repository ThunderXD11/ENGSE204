package lab5;

import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Developer Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Number of Projects: ");
        int dProjects = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Admin Name: ");
        String aName = sc.nextLine();
        System.out.print("Enter Admin Projects: ");
        int aProjects = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Admin Key: ");
        String aKey = sc.nextLine();

        User u1 = new User("Guest");
        Developer d1 = new Developer(dName, dProjects);
        Admin a1 = new Admin(aName, aProjects, aKey);

        User[] users = {u1, d1, a1};

        int totalClearance = 0;
        for (User u : users) {
            totalClearance += u.getClearanceLevel();
        }

        System.out.println("\n--- Checking Admin Key ---");
        for (User u : users) {
            if (u instanceof Admin) {
                Admin tempAdmin = (Admin) u; 
                System.out.println("Admin Key found: " + tempAdmin.getAdminKey());
            }
        }

        System.out.println("Total Clearance: " + totalClearance);
        
        sc.close();
    }
}
