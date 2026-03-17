package LAB5;

import java.util.Scanner;

/*
Q.2) write a complete java program to test whether a given number is a hexadecimal number or not .if it is not ,an
exception should be throwns and processed by the program .the exception must be userdefined .the numbere
must be assigned to string variable.String function must be used to processing.irrespective of whether the
number is a hexadecimal number or not the string Endingthe program must be printed on the screen.
*/
class NotHexaDecimalException extends Exception
{
    public NotHexaDecimalException (String msg)
    {
        super(msg);
    }
}

public class L52 
{
    static void checkHex(String num) throws NotHexaDecimalException 
    {
        if (num == null || num.length() == 0) 
        {
            throw new NotHexaDecimalException("Empty string is not hexadecimal.");
        }

        for (int i = 0; i < num.length(); i++) 
        {
            char ch = num.charAt(i);

            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) 
            {
                throw new NotHexaDecimalException("Invalid character found: " + ch);
            }
        }

        System.out.println(num + " is a valid Hexadecimal number.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        try 
        {
            checkHex(number);
        } 
        catch (NotHexaDecimalException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Ending the program");
        }

        sc.close();
    }
}
