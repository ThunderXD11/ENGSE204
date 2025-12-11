package lab3;

import java.util.Scanner;

class SystemConfig {

    private static SystemConfig instance;
    private String serverUri;
    private int maxConnections;

    private SystemConfig() {
        this.serverUri = "default_server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUri() {
        return serverUri;
    }

    public void setServerUri(String url) {
        this.serverUri = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class lab3_11 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            if (!sc.hasNextInt()) {
                return; 
            }
            int N = sc.nextInt();
            sc.nextLine(); 

            for (int i = 0; i < N; i++) {
                String commandLine = sc.nextLine().trim();
                
                String[] parts = commandLine.split(" ", 2);

                String command = parts[0];
                
                SystemConfig config = SystemConfig.getInstance(); 

                if (command.equalsIgnoreCase("SET_URL")) {
                    if (parts.length > 1) {
                        String url = parts[1];
                        config.setServerUri(url);
                    }
                } else if (command.equalsIgnoreCase("SET_MAX")) {
                    if (parts.length > 1) {
                        try {
                            int count = Integer.parseInt(parts[1]);
                            config.setMaxConnections(count);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid count."); 
                        }
                    }
                } else if (command.equalsIgnoreCase("SHOW")) {
                    System.out.println("URL: " + config.getServerUri());
                    System.out.println("MAX: " + config.getMaxConnections());
                }
            }
        } catch (Exception e) {
        }
    }
}
