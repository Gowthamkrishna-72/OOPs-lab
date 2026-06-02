package LAB8;

/*
1)write a program to read a line of text from the console.find the position of the first and last occurrence of the
string “the” .Copy all the character enclosed between the two positions to another String and print it out.
*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L81 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        File f1 = null;
        FileWriter fw = null;
        FileReader fr = null;

        try 
        {
            f1 = new File("C:\\Users\\GOWTHAM\\OneDrive\\Documents\\OOPs\\LAB8\\L81.txt");
            fw = new FileWriter(f1);
            System.out.println("Enter the string ");
            String ip = sc.nextLine();
            fw.write(ip);
            fw.close();

            fr = new FileReader(f1);
            StringBuilder sb = new StringBuilder();
            int ch;

            while ((ch = fr.read()) != -1) {
                sb.append((char) ch);
            }

            String text = sb.toString();

            String lower = text.toLowerCase();
            int first = lower.indexOf("the");
            int last = lower.lastIndexOf("the");

            if (first != -1 && last != -1 && first != last) 
            {
                String result = text.substring(first + 3, last).trim();
                System.out.println("Extracted string: " + result);
            } 
            else 
            {
                System.out.println("Not enough occurrences of 'the'");
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try 
            {
                if (fr != null) {
                    fr.close();
                }
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }

        }
        sc.close();       
    }
}    

