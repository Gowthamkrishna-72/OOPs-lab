package LAB4;

import java.util.Scanner;

/*
Q.4) You have to enter a string and check whether it is a perfect string or not. A perfect string is a string which has
occurance of every character only once.
Eg. absdhkqwertyuioplmnvczx
*/
public class L44 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        String str = sc.nextLine();

        boolean[] seen = new boolean[256];
        boolean isPerfect = true;
        
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            
            if (seen[ch]) 
            {
                isPerfect = false;
                break;
            } 
            else 
            {
                seen[ch] = true;
            }
        }

        if (isPerfect) 
            System.out.println("The string is a perfect string.");
        else 
            System.out.println("The string is NOT a perfect string.");
                
        sc.close();
        
    }
}
