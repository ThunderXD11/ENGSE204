package lab2;

import java.util.Scanner;

public class lab2_12 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter Course ID: ");
        String courseId = scanner.nextLine(); 

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine(); 

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine(); 

        scanner.close(); 
                
        Course course = new Course(courseId, courseName);

        Student5 student = new Student5(studentName, course);
        
        student.displayEnrollment();
    }
}

class Course {
    
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class Student5 {
    
    private String studentName;
    private Course enrolledCourse;

    public Student5(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}
