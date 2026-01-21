//write an application that input three integer from the user and obtain the sum, average,product,largest and
//smallest of the numbers using interface and abstract class concept.

import java.util.Scanner;

public class L13 
{
    public static void main(String []args)
    {
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1 , num 2 & num3 :");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        sc.close();

        int sum = 0, product = 0, largest=n1, smallest=n1;
        double avg;

        sum = n1 + n2 + n3;
        avg = (sum / 3.0);
        product = n1*n2*n3;
        
        if (n2 > largest)
            largest = n2;
        if (n3 > largest)
            largest = n3;

        if (n2 < smallest)
            smallest = n2;
        if (n3 < smallest)
            smallest = n3;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Product = " + product);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }

}
