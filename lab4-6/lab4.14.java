package lab4;

import java.util.Scanner;

class ScoreBoard {
    private final String gameName;
    private final int[] scores;

    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores; 
    }

    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        
        this.scores = new int[other.scores.length];
        
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + (i == scores.length - 1 ? "" : ", "));
        }
        System.out.println();
    }
}


public class lab4_14 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Game Name: ");
     String name = sc.nextLine(); 
     
     int[] originalScores = new int[3];
     for (int i = 0; i < 3; i++) {
         System.out.print("Enter Score " + (i + 1) + ": ");
         if (sc.hasNextInt()) { 
             originalScores[i] = sc.nextInt();
         } else {
             System.out.println("Invalid input! Please enter a number.");
             sc.next(); 
             i--; 
         }
     }

     ScoreBoard sb1 = new ScoreBoard(name, originalScores);
     ScoreBoard sb2 = new ScoreBoard(sb1);

     originalScores[0] = 999;

     System.out.println("--- Comparison Results ---");
     sb1.displayScores(); 
     sb2.displayScores(); 

     sc.close();
 }
}
