package lab5;

import java.util.Scanner;

class Animal1 {

    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal1 {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class lab5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        Cat cat = new Cat();

        cat.name = name;
        cat.age = age;

        cat.displayInfo();

        cat.makeSound();

        sc.close();
    }
}
