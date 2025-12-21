package lab4;

import java.util.Scanner;

class Schedule {
 private int hour;

 public Schedule(int hour) {
     this.hour = hour;
 }

 public void setHour(int newHour) { this.hour = newHour; }
 public int getHour() { return hour; }
}

class EmployeeSchedule {
 private String name;
 private Schedule schedule;

 public EmployeeSchedule(String name, Schedule schedule) {
     this.name = name;
     this.schedule = schedule; 
 }

 public EmployeeSchedule(EmployeeSchedule other) {
     this.name = other.name; 
     

     this.schedule = new Schedule(other.schedule.getHour()); 
 }

 public void displaySchedule() {
     System.out.println(name + ": " + schedule.getHour() + ":00");
 }
}

public class lab4_12 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     String name = sc.next();
     System.out.print("Enter Initial Hour: ");
     int startHour = sc.nextInt();
     System.out.print("Enter New Hour for Original: ");
     int newHour = sc.nextInt();

     Schedule sch1 = new Schedule(startHour);

     EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);

     EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

     sch1.setHour(newHour);

     System.out.println("--- Comparison Results ---");
     emp1.displaySchedule(); 
     emp2.displaySchedule(); 
     sc.close();
 }
}
