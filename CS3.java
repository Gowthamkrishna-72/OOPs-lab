package CASE_BASE;

import java.util.Scanner;

/*
3. (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you
can compute the minimum runway length needed for an airplane to take off using the
following formula:
length =v
2
2a
Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a
in meters/second squared (m/s2

), length and displays the minimum runway.
*/

class Runway 
{
    double v;
    double a;

    Runway(double v, double a) 
    {
        this.v = v;
        this.a = a;
    }

    double calculateLength() 
    {
        return (v * v) / (2 * a);
    }
}

public class CS3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter take-off speed (m/s): ");
        double v = sc.nextDouble();

        System.out.print("Enter acceleration (m/s²): ");
        double a = sc.nextDouble();

        Runway obj = new Runway(v, a);

        System.out.println("Minimum runway length required is: "
                + obj.calculateLength() + " meters");

        sc.close();
    }
}
