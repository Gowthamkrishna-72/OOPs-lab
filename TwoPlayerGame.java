// 4) Write a program makes two player number game. Players are to feed in an integer number which is not used in 
// the program, but keeps the player engaged in the game. For each player, a random number is generated. the 
// player who gets higher number is the winner. The winner gets points equal to the difference between the two 
// random numbers. 

import java.util.Scanner;
import java.util.Random;

public class TwoPlayerGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Dummy input (just to engage players)
        System.out.print("Player 1, enter any number: ");
        int p1Input = sc.nextInt();

        System.out.print("Player 2, enter any number: ");
        int p2Input = sc.nextInt();

        // Generate random numbers for both players
        int p1Random = rand.nextInt(100); // 0 to 99
        int p2Random = rand.nextInt(100);

        System.out.println("\nPlayer 1 random number: " + p1Random);
        System.out.println("Player 2 random number: " + p2Random);

        // Determine winner
        if (p1Random > p2Random) {
            int points = p1Random - p2Random;
            System.out.println("Player 1 wins!");
            System.out.println("Points earned: " + points);
        } else if (p2Random > p1Random) {
            int points = p2Random - p1Random;
            System.out.println("Player 2 wins!");
            System.out.println("Points earned: " + points);
        } else {
            System.out.println("It's a tie! No points awarded.");
        }

        sc.close();
    }
}