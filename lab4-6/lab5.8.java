package lab5;

import java.util.Scanner;

class Person {
 protected String name;

 public Person(String name) {
     this.name = name;
 }

 public String getStatus() {
     return "Person: " + name;
 }
}

class Student extends Person {
 protected int studentId;

 public Student(String name, int studentId) {
     super(name);
     this.studentId = studentId;
 }

 @Override
 public String getStatus() {
     return "Student: " + name + ", ID: " + studentId;
 }
}

//Class 3: Subclass Employee
class Employee extends Person {
 protected double salary;

 public Employee(String name, double salary) {
     super(name);
     this.salary = salary;
 }

 public void applyBonus(double bonus) {
     salary += bonus;
 }

 @Override
 public String getStatus() {
     return "Employee: " + name + ", Salary: " + salary;
 }
}


public class lab5_8 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String studentName = sc.nextLine();
     int studentId = sc.nextInt();
     sc.nextLine(); 


     String employeeName = sc.nextLine();
     double salary = sc.nextDouble();

     Student student = new Student(studentName, studentId);
     Employee employee = new Employee(employeeName, salary);

     Person[] people = new Person[2];
     people[0] = student;
     people[1] = employee;


     for (Person p : people) {
         if (p instanceof Employee) {
             Employee emp = (Employee) p; 
             emp.applyBonus(1000.0);
         }
     }


     for (Person p : people) {
         System.out.println(p.getStatus());
     }

     sc.close();
 }
}
