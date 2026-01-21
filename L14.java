//Write an application that input from the user that the radius of the circle is an integer and the print the circle
//diameter , circumfrence and area using the floating point value 3.14159 for math.Pi(You can also use the
//predefined constant math.pi for the value of pi.)

import java.util.Scanner;

public class L14 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        int radius = sc.nextInt();
        sc.close();

        double pi = Math.PI;

        double diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);

    }
}
