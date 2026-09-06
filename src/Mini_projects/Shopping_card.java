package Mini_projects;

import java.util.Scanner;

public class Shopping_card {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy? : ");
        String item = sc.nextLine();

        System.out.print("What is the price of each? : ");
        double price = sc.nextDouble();

        System.out.print("How many would you like? :");
        int quantity = sc.nextInt();

        double total;
        total = price * quantity;

        char currency = '$';
        System.out.println("You have bought " +quantity + " " + item + "/s");
        System.out.println("Your total is " + currency +total);


    sc.close();
    }


}
