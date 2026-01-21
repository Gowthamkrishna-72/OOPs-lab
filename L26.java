/*
(Credit limit calculator) Develop a java application that determines whether any of several department -
store customer has exceeded the credit limit on a charge account. For each customer following facts are available:
 account number.
 balance at the begining of the month.
 total of all items charged by the customer this month.
 total of all credits applied to the
*/

import java.util.Scanner;

public class L26 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number (-1 to exit): ");
        int accountNumber = sc.nextInt();

        while (accountNumber != -1)
        {
            System.out.print("Enter beginning balance: ");
            double beginningBalance = sc.nextDouble();

            System.out.print("Enter total charges this month: ");
            double charges = sc.nextDouble();

            System.out.print("Enter total credits this month: ");
            double credits = sc.nextDouble();

            System.out.print("Enter credit limit: ");
            double creditLimit = sc.nextDouble();

            double newBalance = beginningBalance + charges - credits;

            System.out.println("New balance is: " + newBalance);

            if (newBalance > creditLimit)
            {
                System.out.println("Credit limit exceeded.");
            }

            System.out.println();

            System.out.print("Enter account number (-1 to exit): ");
            accountNumber = sc.nextInt();
        }
        sc.close();
    }
}
