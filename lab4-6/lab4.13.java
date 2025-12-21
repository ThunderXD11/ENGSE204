package lab4;

import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        this.durationDays = durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) return this;

        // จำกัดเฉพาะจำนวนวันที่ต่อครั้งเดียว
        int allowedDays = Math.min(days, maxDuration);

        System.out.println("Extension successful.");
        return new Subscription(this.planName, this.durationDays + allowedDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class lab4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int systemMax = sc.nextInt();
        Subscription.setMaxDuration(systemMax);

        String name = sc.next();
        int initialDays = sc.nextInt();
        Subscription sub1 = new Subscription(name, initialDays);

        int extend1 = sc.nextInt();
        Subscription sub2 = sub1.extend(extend1);

        int extend2 = sc.nextInt();
        Subscription sub3 = sub2.extend(extend2);

        sub3.displayInfo();
        sc.close();
    }
}
