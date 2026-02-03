package CASE_BASE;

/*
6. (Display numbers in a pyramid pattern) Write a nested forloop that prints the following output
*/
public class CS6 
{
    public static void main(String[] args) 
     {

        int rows = 8;

        for (int i = 1; i <= rows; i++) 
        {
            // 
            for (int s = rows - i; s > 0; s--) 
            {
                System.out.print("   ");
            }

            // 
            int num = 1;
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num + "  ");
                num *= 2;
            }

            // 
            num /= 4;
            for (int j = 1; j < i; j++) 
            {
                System.out.print(num + "  ");
                num /= 2;
            }

            System.out.println();
        }
    }
}
