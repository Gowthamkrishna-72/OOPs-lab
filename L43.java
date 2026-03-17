package LAB4;
/*
Q.3) A string is entered like aabcdeaabcjlkjerwlaaabbsadfdsf...
And you have to print those characters which exceed a given no. n entered by user.
*/

import java.util.Scanner;

public class L43 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        String str = sc.nextLine();

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) 
        {
            freq[str.charAt(i)]++;
        }

        System.out.println("Characters occurring more than " + n + " times:");

        boolean[] printed = new boolean[256];
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (freq[ch] > n && !printed[ch]) 
            {
                System.out.print(ch + " ");
                printed[ch] = true;
            }
        }
        sc.close();
    }

}
