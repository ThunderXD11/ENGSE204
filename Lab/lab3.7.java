package lab3;

import java.util.Scanner;

class Employee {

    private String employeeId;
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

public class Lab3_7 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            String id = sc.nextLine();
            
            String initialDept = sc.nextLine();
            
            String newDept = sc.nextLine();
            
            Employee emp = new Employee(id, initialDept);
            
            emp.setDepartment(newDept);
            
            System.out.println(emp.getEmployeeId());
            
            System.out.println(emp.getDepartment());
        }
    }
}
