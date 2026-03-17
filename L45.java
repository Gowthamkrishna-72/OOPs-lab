package LAB4;

import java.util.Scanner;

/*
Q.5) you have to enter a range from a and b and search how many no. of times a pattern n. occurs between the
range a and b.
Eg :i/p:enter range :0 100
Enter pattern: 13
o/p: the no. times 13 occurred betwwn 0 to 100:1
Eg :i/p:enter range :100 1000
Enter pattern: 13
o/p: the no. times 13 occurred betwwn 100 to 1000:
(in this 13,113,131,132,133.139,213,313,.913 all these will be counted)
*/
public class L45 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int count = 0;

        System.out.println("Numbers containing pattern " + pattern + ":");

        for (int i = a; i <= b; i++) 
        {
            if (String.valueOf(i).contains(pattern)) 
            {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nThe number of times " + pattern + " occurred between " + a + " to " + b + " : " + count);

        sc.close();
    }   
}
