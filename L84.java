package LAB8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
5) Write a program to read a line of text from the console. change the first character of each word to uppercase
letter and print out the resulting string.
*/
public class L84 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        File f1 = null;
        FileWriter fw = null;
        BufferedReader br = null;
        
        try
        {
            f1 = new File("C:\\Users\\GOWTHAM\\OneDrive\\Documents\\OOPs\\LAB8\\L84.txt");
            fw = new FileWriter(f1);

            System.out.println("Enter a line of text:");
            String ip = sc.nextLine();
            fw.write(ip);
            fw.close();

            br = new BufferedReader(new FileReader(f1));
            String text = br.readLine(); // single line

            // Step 3: Convert first letter of each word to uppercase
            StringBuilder result = new StringBuilder();
            boolean newWord = true;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (Character.isWhitespace(ch)) {
                    result.append(ch);
                    newWord = true;
                } else {
                    if (newWord) {
                        result.append(Character.toUpperCase(ch));
                        newWord = false;
                    } else {
                        result.append(ch);
                    }
                }
            }

            System.out.println("Result: " + result.toString());

        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (br != null)
                    br.close();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }

        sc.close();
    }   
}
