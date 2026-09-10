/*package Math.java;

public class math_function {

    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2,5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.max(10,20);
        result = Math.min(10,20);


        System.out.println(result);
    }
}


package Math.java;
import java.util.Scanner;

public class math_function {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A :");
        a = sc.nextDouble();

        System.out.print("Enter the length of side B : ");
        b = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is : " + c);


        sc.close();
    }
    }

 */

//circumference of the circle

package Math.java;
import java.util.Scanner;

public class math_function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;


        System.out.print("Enter thr radius : ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius , 2);
        volume = (4.0 /3.0) * Math.PI * Math.pow(radius , 3);

        System.out.println("the circumference is : " + circumference);
        System.out.println("the area is : " + area);
        System.out.println("the volume is : " + volume);

        sc.close();
    }

    }

