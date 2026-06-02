package LAB8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
6) write a program to read a text file ,”sdj.txt” and replace all his “his” words with another word “her”.
*/
public class L85 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        File f1 = null;
        FileWriter fw = null;
        BufferedReader br = null;
        
        try
        {
            f1 = new File("C:\\Users\\GOWTHAM\\OneDrive\\Documents\\OOPs\\LAB8\\L85.txt");
            fw = new FileWriter(f1);

            System.out.println("Enter a line of text:");
            String ip = sc.nextLine();
            fw.write(ip);
            fw.close();

            br = new BufferedReader(new FileReader(f1));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            String text = sb.toString();

            text = text.replace("his", "her");

            fw = new FileWriter(f1);
            fw.write(text);
            fw.close();

            System.out.println("Updated content:\n" + text);

        } 
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        sc.close();
    }
}
