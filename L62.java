package LAB6;

import java.util.Scanner;

/*
Q.2) An old-style movie theater has a simple profit program. Each customer pays $5 per ticket. Every
performance costs the theater $20, plus $.50 per attendee.Develop the program calculate TotalProfit that
consumes the number of attendees (of a show) and calculates how much income the show earns.
*/

public class L62 
{
     public static double calculateTotalProfit(int attendees)
    {
        double income = 5 * attendees;
        double totalCost = 20 + (0.50 * attendees);
        double profit = income - totalCost;
        return profit;
    }
 
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        double totalProfit = calculateTotalProfit(attendees);

        System.out.println("Total Profit: $" + totalProfit);

        sc.close();
    }
}
