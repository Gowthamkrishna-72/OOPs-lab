//Q5)Write an application that inputs one number consisting of five digits from the user, separate the number into
//its individual digits and print the digit separates from one another for three spaces each. for example if the user
//type the number 42335 the program should print ( 4 2 3 3 5).

import java.util.Scanner;

public class L15 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five digit number :");
        int num = sc.nextInt();
        sc.close();
        
        int q,rev=0;
        while (num > 0)
        {
            q = num % 10;
            rev = (rev*10) + q;
            num = num / 10;
        }
        while (rev>0)
        {
            q = rev % 10;
            System.out.print(q+"   ");
            rev = rev / 10;
        }
    }
}
