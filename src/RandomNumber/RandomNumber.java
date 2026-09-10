package RandomNumber;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();

//        int num1 = random.nextInt(1 ,101);
//        int num2 = random.nextInt(1 ,101);
//        int num3 = random.nextInt(1,101);

        double number ;
        boolean isHeads;


        isHeads= random.nextBoolean();
        number = random.nextDouble();

        System.out.println(number);
        System.out.println(isHeads);

        if (isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("TAILS");
        }

//        System.out.println(num2);
//        System.out.println(num3);
    }
}