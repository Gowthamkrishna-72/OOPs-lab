package CASE_BASE;

import java.util.Random;

/*
7. (Monte Carlo simulation) A square is divided into four smaller regions as shown below in (a).
If you throw a dart into the square 1,000,000 times, what is the prob ability for a dart to fall

into an odd-numbered region? Write a program to simulate the process and display the result.
(Hint: Place the center of the square in the center of a coordinate system, as shown in (b).
Randomly generate a point in the square and count the number of times for a point to fall into
an odd-numbered region.)
*/
public class CS7 
{
    public static void main(String[] args) 
    {

        int totalThrows = 1_000_000;
        int oddCount = 0;

        Random rand = new Random();

        for (int i = 0; i < totalThrows; i++) {
            double x = -1 + 2 * rand.nextDouble();
            double y = -1 + 2 * rand.nextDouble();

            if (x < 0) 
            {
                oddCount++;
            }
  
            else if (x > 0 && y > 0 && y > x) 
            {
                oddCount++;
            }
        }

        double probability = (double) oddCount / totalThrows;

        System.out.println("Probability of falling into an odd-numbered region: " + probability);
    }
}
