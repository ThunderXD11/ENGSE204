package lab4;

import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        this.darkMode = darkMode;

        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }
    }

    public Configuration(Configuration base, Configuration user) {

        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode);
    }
}

public class lab4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base Config (Theme, FontSize, DarkMode):");
        String bTheme = sc.next();
        int bSize = sc.nextInt();
        boolean bDark = sc.nextBoolean();
        Configuration baseConfig = new Configuration(bTheme, bSize, bDark);

        System.out.println("Enter User Config (Theme, FontSize, DarkMode):");
        String uTheme = sc.next();
        int uSize = sc.nextInt();
        boolean uDark = sc.nextBoolean();
        Configuration userConfig = new Configuration(uTheme, uSize, uDark);

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        System.out.println("--- Final Configuration ---");
        finalConfig.displaySettings();

        sc.close();
    }
}
