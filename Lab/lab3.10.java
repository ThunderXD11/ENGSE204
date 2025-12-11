package lab3;

import java.util.Scanner;

class SystemLogger {

    private static int currentloglevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1:
                return "INFO";
            case 2:
                return "DEBUG";
            case 3:
                return "ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentloglevel = newLevel;
            System.out.println("Log level set to [" + getLevelName(newLevel) + "]");
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messagelevel, String message) {
        if (messagelevel >= currentloglevel) {
            System.out.println("[" + getLevelName(messagelevel) + "]: " + message);
        }
    }
}

public class lab3_10 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int N = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < N; i++) {
                String commandLine = sc.nextLine();
                String[] parts = commandLine.split(" ", 3);

                String command = parts[0];

                if (command.equalsIgnoreCase("SET")) {
                    int newLevel = Integer.parseInt(parts[1]);
                    SystemLogger.setLogLevel(newLevel);
                } else if (command.equalsIgnoreCase("LOG")) {
                    int messageLevel = Integer.parseInt(parts[1]);
                    String message = parts[2];
                    SystemLogger.log(messageLevel, message);
                }
            }
        } catch (Exception e) {
            
        }
    }
}
