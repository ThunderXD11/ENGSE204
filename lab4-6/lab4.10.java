package lab4;

import java.util.Scanner;

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        this.startHour = validateHour(startHour);
        this.endHour = validateHour(endHour);

        if (this.startHour > this.endHour) {
            int temp = this.startHour;
            this.startHour = this.endHour;
            this.endHour = temp;
        }
    }

    private int validateHour(int hour) {
        if (hour < 0) return 0;
        if (hour > 23) return 23;
        return hour;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class lab4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mode (1 or 2): ");
        int mode = sc.nextInt();

        TimePeriod period;

        if (mode == 1) {
            period = new TimePeriod();
        } else {
            System.out.print("Enter start hour: ");
            int start = sc.nextInt();
            System.out.print("Enter end hour: ");
            int end = sc.nextInt();
            period = new TimePeriod(start, end);
        }

        period.displayPeriod();
        
        sc.close();
    }
}
