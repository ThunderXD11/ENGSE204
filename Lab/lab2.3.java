package lab2;

import java.util.Scanner;

public class lab2_3 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter the number of students to register : ");
        int N = scanner.nextInt(); 
        
        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            System.out.println("--- Student Data " + (i + 1) + " ---");
            
            System.out.print("Student ID: ");
            String inputStudentId = scanner.nextLine(); 

            System.out.print("Name: ");
            String inputName = scanner.nextLine(); 

            new Student2(inputStudentId, inputName);
        }

        scanner.close(); 
        
        System.out.println("\nTotal number of Student objects created: " + Student2.studentCount);
    }
}

class Student2 {
    
    private String studentId;
    private String name;

    public static int studentCount = 0;

    public Student2(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        
        Student2.studentCount++; 
    }
    
}
