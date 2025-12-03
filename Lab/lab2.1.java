package lab2;

import java.util.Scanner;

public class lab21 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        

        System.out.print("Enter Student ID: ");
        String inputStudentId = scanner.nextLine(); 

        System.out.print("Enter Name: ");
        String inputName = scanner.nextLine(); 

        scanner.close(); 
                
        Student student = new Student(inputStudentId, inputName);

        System.out.println(student.getStudentId());
        System.out.println(student.getName());
    }
}

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
