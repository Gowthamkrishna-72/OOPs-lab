package LAB8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
3) A set of 10 names is given. write a program to delete the first three characters of the names and arrange the
resulting names in alphabetical order and print them out.
*/
public class L83 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        File f1 = null;
        FileWriter fw = null;
        BufferedReader br = null;

        try
        {
            f1 = new File("C:\\Users\\GOWTHAM\\OneDrive\\Documents\\OOPs\\LAB8\\L83.txt");
            fw = new FileWriter(f1);
            System.out.println("Enter 10 names:");

            for (int i = 0; i < 10; i++) 
            {
                String name = sc.nextLine();
                fw.write(name + "\n");
            }
            fw.close();

            br = new BufferedReader(new FileReader(f1));
            ArrayList<String> list = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) 
            {
                if (line.length() >= 3) {
                    list.add(line.substring(3));
                } else {
                    list.add(""); 
                }
            }

            Collections.sort(list);

            System.out.println("Sorted names after removing first 3 characters:");
            for (String s : list) 
            {
                System.out.println(s);
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
         finally
        {
            try 
            {
                if (br != null) {
                    br.close();
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
