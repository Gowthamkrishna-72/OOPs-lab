package LAB4;

import java.util.Scanner;

/*
Q.6)Declare an interface called Function that has a method named evaluate that takes an int parameter and
returns an int value.Create a class Half that implements Function. Make the implementation of the method
evaluate() return the value obtained by dividing the int argument by 2.In a client, create a method that takes an
arbitrary array of int values as parameter and returns an array that has the same length, but the value of an
element in the new array is half that of the value in the corresponding element in the array passed as parameter.
Let the implementation of this method create an instance of Half and use this instance to calculate the values in
the array to be returned.
*/
interface Function {
    public int evaluate(int value);
}

class Half implements Function
{
    public int evaluate(int value) 
    {
        return value/2;
    }
}
public class L46 
{
    public static int[] halfArray(int[] arr)
    {
        int[] result = new int[arr.length];
        Function f = new Half();

        for(int i=0;i<arr.length;i++)
        {
            result[i] = f.evaluate(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] input = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int[] output = halfArray(input);

        System.out.println("Half array:");
        for (int val : output) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
