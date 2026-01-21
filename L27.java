/*
Q7.)A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an
additional $0.50 per hours for each hours or part thereof in excess of three hours. The maximum charge for any
given 24-hours period is $10.00.Assume that no car parks for longer than 24 hours at a time. Write an application
that calculates and displays the parking charges for each customers who parked in the garage yesterday. You
should enter the hours parked for each customers . The program should display the charge for the current
customers and should calculate and display the running total os yesterday's receipts. It should use the method
calculate charges to determine the charge for each customer.
*/

import java.util.Scanner;

public class L27 
{
    // Method to calculate parking charge
    public static double calculateCharges(double hours) 
    {
        double charge = 2.00;

        if (hours > 3) 
        {
            charge += Math.ceil(hours - 3) * 0.50;
        }

        if (charge > 10.00) 
        {
            charge = 10.00;
        }
        return charge;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double totalReceipts = 0.0;
        int customer = 1;

        System.out.println("Enter hours parked for each customer.");
        System.out.println("Enter -1 to stop.\n");

        System.out.print("Customer " + customer + " hours parked: ");
        double hours = sc.nextDouble();
            
        while (hours!=-1) 
        {
            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Charge for Customer %d: $%.2f%n%n",customer, charge);

            customer++;

            System.out.print("Customer " + customer + " hours parked: ");
            hours = sc.nextDouble();
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n",  totalReceipts);

        sc.close();
    }
}
