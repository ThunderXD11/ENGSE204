package lab2;

import java.util.Scanner;

public class lab2_4 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Name: ");
        String name = scanner.nextLine(); 

        System.out.print("Midterm Score: ");
        int midtermScore = scanner.nextInt(); 

        System.out.print("Final Score: ");
        int finalScore = scanner.nextInt(); 

        scanner.close(); 
                
        Student3 student = new Student3(name, midtermScore, finalScore);

        student.displaySummary(); 
    }
}

class Student3 {
    
    private String name;
    private int midtermScore;
    private int finalScore;

    public Student3(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0; 
    }

    public void displaySummary() {
        
        double averageScore = calculateAverage();
        
        String status = (averageScore >= 50.0) ? "Pass" : "Fail";
        
        System.out.println("Name: " + name); 
        System.out.printf("Average Score: %.1f%n", averageScore);
        System.out.println("Status: " + status);
    }
}
