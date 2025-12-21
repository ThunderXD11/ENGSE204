package lab4;

import java.util.Scanner;

class Color {

    private final int red;
    private final int green;
    private final int blue;

    public Color(int r, int g, int b) {
        this.red = validate(r);
        this.green = validate(g);
        this.blue = validate(b);
    }

    private int validate(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        }
        return value;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

public class lab4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        Color color = new Color(r, g, b);
        color.displayRGB();

        sc.close();
    }
}
