//Write an application that asks user to enter two integer, obtain them from the user and display the larger
//number followed by the word "is larger". if the numbers are equal, print the" the number are equal". Path and
//Classpath Concept use in this Application.

import java.util.Scanner;

public class L12 
{
    public static void main(String []args)
    {
        int n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1 & num 2 :");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        sc.close();

        if(n1>n2)
        {
            System.out.println(n1 + " is larger");
        }
        else if (n1<n2)
        {
            System.out.println(n2 + "is larger");
        }
        else
        {
            System.out.println( " the number are equal");
        }
    }
}
