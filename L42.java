package LAB4;

import java.util.Scanner;

/*
Q.2) We need to write the function to check the password entered is correct or not based on the following
conditions.
a) It must have atleast one lower case character and one digit.
b) It must not have any Upper case characters and any special characters
c) length should be b/w 5-12.
d) It should not have any same immediate patterns like
abcanan1 : not acceptable coz of an an pattern
abc11se: not acceptable, coz of pattern 11
123sd123 : acceptable, as not immediate pattern
adfasdsdf : not acceptable, as no digits
Aasdfasd12: not acceptable, as have uppercase character
*/
public class L42 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String str = sc.nextLine();

        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasUpperOrSpecial = false;
        boolean hasImmediateRepeat = false;

        if (str.length() < 5 || str.length() > 12) 
        {
            System.out.println("Password is NOT acceptable (length issue)");
            sc.close();
            return;
        }

        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') 
                hasLower = true; 
            else if (ch >= '0' && ch <= '9') 
                hasDigit = true;
            else 
                hasUpperOrSpecial = true;

            if (i > 0) 
            {
                if (ch == str.charAt(i - 1)) 
                {
                    hasImmediateRepeat = true;
                }
            }
            if (i > 1) 
            {
                String prevPair = str.substring(i - 2, i);
                String currPair = str.substring(i - 1, i + 1);
                if (prevPair.equals(currPair)) 
                {
                    hasImmediateRepeat = true;
                }
            }
        }
        if (hasLower && hasDigit && !hasUpperOrSpecial && !hasImmediateRepeat) 
        {
            System.out.println("Password is ACCEPTABLE");
        } 
        else 
        {
            System.out.println("Password is NOT acceptable");
        }
        sc.close();
    } 
}
