package CASE_BASE;

import java.util.Scanner;

/*
4. (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on
weight. It can be calculated by taking your weight in kilograms and dividing by the square of

your height in meters. Write a program that prompts the user to enter a weight in pounds and
height in inches and displays the BMI. Note that one pound is 0.45359237 kilograms and one
inch is 0.0254 meters.
*/

class BMI 
{
    double weightPounds;
    double heightInches;

    BMI(double weightPounds, double heightInches) 
    {
        this.weightPounds = weightPounds;
        this.heightInches = heightInches;
    }

    double calculateBMI() 
    {
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        return weightKg / (heightMeters * heightMeters);
    }
}

public class CS4 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        // Creating new object
        BMI obj = new BMI(weight, height);

        System.out.println("Your BMI is: " + obj.calculateBMI());

        sc.close();
    }
}
