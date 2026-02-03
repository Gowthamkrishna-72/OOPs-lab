package CASE_BASE;

import java.util.Scanner;

/*
1. (Physics: acceleration) Average acceleration is defined as the change of velocity divided by the
time taken to make the change, as shown in the following formula:
a =
v0−v1
t
Write a program that prompts the user to enter the starting velocity meters/second, the ending
velocity v1 v0 in in meters/second, and the time span t in seconds, and displays the average
acceleration.
*/
class Acceleration 
{
    double v0, v1, t;

    Acceleration(double v0, double v1, double t) {
        this.v0 = v0;
        this.v1 = v1;
        this.t = t;
    }

    double calculateAcceleration() {
        return (v1 - v0) / t;
    }
}
public class CS1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting velocity (m/s): ");
        double v0 = sc.nextDouble();

        System.out.print("Enter ending velocity (m/s): ");
        double v1 = sc.nextDouble();

        System.out.print("Enter time taken (seconds): ");
        double t = sc.nextDouble();

        Acceleration obj = new Acceleration(v0, v1, t);

        System.out.println("Average acceleration is: "
                + obj.calculateAcceleration() + " m/s²");

        sc.close();
    }
}
