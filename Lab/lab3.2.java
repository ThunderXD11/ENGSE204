package lab3;

import java.util.Scanner;

class Player {
    private int score;

    public Player(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class lab3_2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { 
            
            int initialScore = sc.nextInt();
            
            int updatedScore = sc.nextInt();
            
            Player p = new Player(initialScore);
            
            p.setScore(updatedScore);
            
            System.out.println(p.getScore());
            
        } 
    }
}
