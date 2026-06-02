package LAB8;

/*
2) Write a program to read a line of text from the console.Print out only the vowels(a,e,i,o,u) and their position of
occurrence.
*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L82 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        File f1 = null;
        FileWriter fw = null;
        FileReader fr = null;

        try 
        {
            f1 = new File("C:\\Users\\GOWTHAM\\OneDrive\\Documents\\OOPs\\LAB8\\L82.txt");
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

           
            String text = sb.toString().trim();

            System.out.println("Vowels and their positions:");

            for (int i = 0; i < text.length(); i++) {
                char c = Character.toLowerCase(text.charAt(i));

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.println(text.charAt(i) + " at position " + (i + 1));
                }
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
