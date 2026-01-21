//Q1)Create an application that calculate your daily driving cost , so that you can estimate how much money could
 //   be saved by car pooling which also has other advantages such as reducing carbon emission and traffic congestion
    //. The application should input the following informationand display the user's cost per day of driving to work.

   //  a)total miles driven per day
  //   b)cost per gallon of gasoline
   //  c)average fees per day
 //    d)tolls per day

import java.util.Scanner;

public class L21
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);

    double milesPerDay, costPerGallon, avgFees,tolls,milesPerGallon;

    System.out.print("Enter the total miles driven per day :");
    milesPerDay = sc.nextDouble();

    System.out.print("Enter the miles per gallon :");
    milesPerGallon = sc.nextDouble();

    System.out.print("Enter the cost per gallon of gasoline :");
    costPerGallon = sc.nextDouble();

    System.out.print("Enter the average fees per day :");
    avgFees = sc.nextDouble();

    System.out.print("Enter the tolls per day :");
    tolls = sc.nextDouble();

    sc.close();
    double fuelCost = (milesPerDay / milesPerGallon) * costPerGallon;

    double totalCost = fuelCost + avgFees + tolls;

    System.out.println("Your daily driving cost : "+totalCost);
  }
}