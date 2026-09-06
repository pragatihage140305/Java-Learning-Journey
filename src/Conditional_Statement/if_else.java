package Conditional_Statement;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        // GROUP 1 - Name
        System.out.println("Enter your Name:");
        name = sc.nextLine();

        // GROUP 2 - Age
        System.out.println("Enter your Age:");
        age = sc.nextInt();

        // GROUP 3 - Student
        System.out.println("Are you a Student? (true/false)");
        isStudent = sc.nextBoolean();


        // Name condition
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        }
        else {
            System.out.println("Hello " + name + "!");
        }


        // Age condition
        if (age < 0) {
            System.out.println("You haven't been born yet!");
        }
        else if (age == 0) {
            System.out.println("You are a baby!");
        }
        else if (age < 18) {
            System.out.println("You are a child!");
        }
        else if (age >= 65) {
            System.out.println("You are a Senior!");
        }
        else {
            System.out.println("You are an Adult!");
        }


        // Student condition
        if (isStudent) {
            System.out.println("You are a Student!");
        }
        else {
            System.out.println("You are a Teacher!");
        }


        sc.close();
    }
}