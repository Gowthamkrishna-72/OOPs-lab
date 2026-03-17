package LAB7;

import java.util.Scanner;

/*
Q.1) Develop a program that accepts an initial amount of money (called the principal), a simple annual interest
rate, and a number of months will compute the balance at the end of that time. Assume that no additional
deposits or withdrawals are made and that a month is 1/12 of a year. Total interest is the product of the
principal, the annual interest rate expressed as a decimal, and the number of years.
*/

public class L71 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Months: ");
        int months = sc.nextInt();

        double decimalRate = rate / 100;

        double years = months / 12.0;

        double interest = principal * decimalRate * years;

        double balance = principal + interest;

        System.out.println("Total Interest: " + interest);
        System.out.println("Final Balance: " + balance);

        sc.close();
    }    
}
