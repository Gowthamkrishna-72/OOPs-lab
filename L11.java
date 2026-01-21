//Write an application that ask the user to enter two integer, obtain them from user and print their sum, product,
//difference and quotient and must be use package concept in this application.

import java.util.Scanner;

public class L11 
{
    public static void main(String []args)
    {
        int n1;
        int n2;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1 :");
        n1 = sc.nextInt();

        System.out.println("Enter num 2 :");
        n2 = sc.nextInt();
        sc.close(); 
        System.out.println("Sum       :" + (n1 + n2));
        System.out.println("Product   :" + (n1 * n2));
        System.out.println("Difference:" + (n1-n2));
        System.out.println("Quotient  :" + (n1/n2));
    }
}