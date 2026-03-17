package LAB5;

import java.util.Scanner;

/*
Q.5) Utopias tax accountants always use programs that compute income taxes even though the tax rate is a solid,
never- changing 15%.Define the program calculate Tax which determines the tax on the gross pay. Define
calculate NetPay that determines the net pay of an employee from the number of hours worked. Assume an
hourly rate of $12.
*/

class  TaxCalculator
{
    static final double TAX_RATE = 0.15;
    static final double HOURLY_RATE = 0.12;

    static double calculateTax(double grossPay)
    {
        return grossPay * TAX_RATE;
    }

    static double calculateNetPay(int hoursWorked)
    {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }
}

public class L55 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of hours worked: ");
        int hoursWorked = sc.nextInt();

        double grossPay = hoursWorked * TaxCalculator.HOURLY_RATE;
        double tax = TaxCalculator.calculateTax(grossPay);
        double netPay = TaxCalculator.calculateNetPay(hoursWorked);

        System.out.println("Gross Pay   : $" + grossPay);
        System.out.println("Tax (15%)   : $" + tax);
        System.out.println("Net Pay     : $" + netPay);
        
        sc.close();
    }
}


