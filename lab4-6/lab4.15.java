package lab4;

import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        
        int count = Math.min(logs.length, maxMessages);
        this.logMessages = new String[count];
        
        int startPos = logs.length - count;
        for (int i = 0; i < count; i++) {
            this.logMessages[i] = logs[startPos + i];
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + maxMessages);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];
            System.arraycopy(logMessages, 0, newLogs, 0, logMessages.length);
            newLogs[logMessages.length] = message;
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: [" + logMessages.length + "] ");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i] + (i == logMessages.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}

public class lab4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int maxPolicy = sc.nextInt();
        AuditRecord.setPolicy(maxPolicy);
        
        String username = sc.next();
        AuditRecord record = new AuditRecord(username);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String msg = sc.nextLine();
            record = record.addMessage(msg);
        }

        record.displayLog();
        sc.close();
    }
}
