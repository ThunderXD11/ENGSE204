package lab4;

import java.util.Scanner;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource [" + id + "] created.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource [" + id + "] finalized (destroyed).");
        } finally {
            super.finalize();
        }
    }
}

public class lab4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID 1: ");
        String id1 = sc.next();
        System.out.print("Enter ID 2: ");
        String id2 = sc.next();
        System.out.print("Enter ID 3: ");
        String id3 = sc.next();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.out.println("--- Calling System.gc() first time ---");
        System.gc();

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        r3 = null;

        System.out.println("--- Calling System.gc() second time ---");
        System.gc();

        try { Thread.sleep(100); } catch (InterruptedException e) {}
        
        sc.close();
    }
}
