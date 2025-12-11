package lab3;

import java.util.Scanner;

class LicenseManager {

    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMaxLimit(int max) {
        if (max < 0 || max < usedLicenses || (max < 5 && max >= 0)) {
            if (max < 0) {
                 System.out.println("Invalid max value.");
            } 
            else {
                System.out.println("Cannot set max lower than current usage.");
            }
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to [" + max + "]");
        }
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        int available = maxLicenses - usedLicenses;
        System.out.println("Used: [" + usedLicenses + "] and Available: [" + available + "]");
    }
}

public class lab3_13 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int N = 0;
            if (sc.hasNextInt()) {
                N = sc.nextInt();
                sc.nextLine();
            } else {
                return;
            }

            for (int i = 0; i < N; i++) {
                String commandLine = sc.nextLine().trim();
                
                String[] parts = commandLine.split(" ", 2);

                String command = parts[0];

                if (command.equalsIgnoreCase("SET")) {
                    if (parts.length > 1) {
                        try {
                            int newMax = Integer.parseInt(parts[1]);
                            LicenseManager.setMaxLimit(newMax);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid max value.");
                        }
                    } else {
                        System.out.println("Invalid max value."); // ถ้ามีแต่ SET ไม่มีตัวเลขตามมา
                    }
                } else if (command.equalsIgnoreCase("CHECKOUT")) {
                    LicenseManager.checkOut();
                } else if (command.equalsIgnoreCase("CHECKIN")) {
                    LicenseManager.checkIn();
                } else if (command.equalsIgnoreCase("STATUS")) {
                    LicenseManager.displayStatus();
                }
            }
        } catch (Exception e) {
        }
    }
}
