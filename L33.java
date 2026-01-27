/*
Q3.) Design a class named 'x' having two attributes i and j of the type int. Let it have a constructor that takes in
two argument of type int and assign them to i and j.Let it also have a method name final sum that compute the
sum of i and j that return it.Let a class 'y' extend class x,lets it have its own constructer and method name find
product that compute and return i*j. lets a class Z extend a class Y.Design a class name multilevel inheritance
demo it must have the main method in which the object of class Z is constructed and all the methods(its own and
the inherited one ) are invokeand the sum difference and the product are display.
*/

import java.util.Scanner;

class X 
{
    int i, j;

    public X (int i, int j) 
    {
        this.i = i;
        this.j = j;
    }

    final int sum() 
    {
        return i + j;
    }
}

class Y extends X 
{
    Y(int i, int j) 
    {
        super(i, j);
    }

    int findProduct() 
    {
        return i * j;
    }
}

class Z extends Y 
{
    Z(int i, int j) 
    {
        super(i, j);
    }

    int findDifference() 
    {
        return i - j;
    }
}
public class L33 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter i :");
        int i = sc.nextInt();
        System.out.print("Enter j :");
        int j = sc.nextInt();

        Z obj = new Z(i, j);
        
        sc.close();
        
        System.out.println("Sum        : " + obj.sum());
        System.out.println("Difference : " + obj.findDifference());
        System.out.println("Product    : " + obj.findProduct());
    }
}
