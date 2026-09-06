package Basics;/*import java.util.Scanner;

public class Basics.UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name:");
        String name = scanner.nextLine();
        System.out.println("Hellow " +name);



        System.out.print("Enter Your Age:");
        int age = scanner.nextInt();
        System.out.println("You Are Age Is : " +age);


        System.out.println("What is your GPA : ");
        double GPA = scanner.nextDouble();
        System.out.println("Your GPA is  : " +GPA);


        System.out.print("Are You Student ? (true/false) : " );
        Boolean isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.println("You are enrolled  as a student.");
        }
        else{
            System.out.println("You are enrolled  as a student.");
        }


        scanner.close();
    }
}
*/


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {



//Calculate the area of rectangle

        double Width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        Width = scanner.nextDouble();

        System.out.print("Enter height :");
        height = scanner.nextDouble();

        area = Width * height;

        System.out.print("Area of Rectange is : "+area +"cm");

    }
}
