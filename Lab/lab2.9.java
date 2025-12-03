package lab2;

import java.util.Scanner;

public class lab2_9 {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter Name: ");
        String inputName = scanner.nextLine(); 

        System.out.print("Enter Street: ");
        String inputStreet = scanner.nextLine(); 

        System.out.print("Enter City: ");
        String inputCity = scanner.nextLine(); 
        
        System.out.print("Enter Zip Code: ");
        String inputZipCode = scanner.nextLine(); 

        scanner.close(); 
                
        Address studentAddress = new Address(inputStreet, inputCity, inputZipCode);

        Student4 student = new Student4(inputName, studentAddress);
        
        student.displayProfile();
    }
}

class Address {
    
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}

class Student4 {
    
    private String name;
    private Address address;

    public Student4(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}
