package lab4;
import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startX = sc.nextInt(); 
        int startY = sc.nextInt(); 
        int step = sc.nextInt();   
        int count = sc.nextInt();  

        Point p1 = new Point(startX, startY);
        p1.displayInfo();

        Point p2 = new Point(startX + 2, startY + 1);
        p2.displayInfo();

        Point p3 = new Point(startX + 4, startY + 2);
        p3.displayInfo();
        
        sc.close();
    }
}
