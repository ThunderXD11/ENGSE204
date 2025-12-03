package lab2;

import java.util.Scanner;

public class lab2_3 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("จำนวนนักเรียนที่ต้องการลงทะเบียน : ");
        int N = scanner.nextInt(); 
        
        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            System.out.println("ข้อมูลนักเรียนคนที่ " + (i + 1));
            
            System.out.print("รหัสนักศึกษา: ");
            String inputStudentId = scanner.nextLine(); 

            System.out.print("ชื่อ-นามสกุล: ");
            String inputName = scanner.nextLine(); 

            new Student2(inputStudentId, inputName);
        }

        scanner.close(); 
        
        System.out.println("จำนวนวัตถุ Student ที่ถูกสร้างทั้งหมด: " + Student2.studentCount);
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
