package CASE_BASE;

import java.util.Scanner;

/*
2. (Science: calculating energy) Write a program that calculates the energy eeded to heat water
from an initial temperature to a final temperature. Your program should prompt the user to enter
the amount of water in kilograms and the initial and final temperatures of the water. The formula
to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy
Q is measured in joules.
*/

class Energy {
    double mass;
    double initialTemp;
    double finalTemp;

    Energy(double mass, double initialTemp, double finalTemp) {
        this.mass = mass;
        this.initialTemp = initialTemp;
        this.finalTemp = finalTemp;
    }

    double calculateEnergy() {
        return mass * (finalTemp - initialTemp) * 4184;
    }
}

public class CS2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of water (kg): ");
        double m = sc.nextDouble();

        System.out.print("Enter initial temperature (°C): ");
        double t1 = sc.nextDouble();

        System.out.print("Enter final temperature (°C): ");
        double t2 = sc.nextDouble();

        // Creating new object
        Energy obj = new Energy(m, t1, t2);

        System.out.println("Energy needed is: "
                + obj.calculateEnergy() + " joules");

        sc.close();
    }
}
