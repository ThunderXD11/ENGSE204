package lab2;

import java.util.Scanner;

public class lab22 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        

        System.out.print("ใส่รหัสนักศึกษา (Enter Student ID): ");
        String inputStudentId = scanner.nextLine(); 

        System.out.print("ใส่ชื่อ-นามสกุล (Enter Name): ");
        String inputName = scanner.nextLine(); 

        scanner.close(); 
                
        Student1 student = new Student1(inputStudentId, inputName);

        student.displayInfo(); 
    }
}

class Student1 {

    private String studentId;
    private String name;


    public Student1(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

 
    public void displayInfo() {

        System.out.println("รหัสนักศึกษา: " + studentId);
        System.out.println("ชื่อ-นามสกุล: " + name);
    }
    

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
