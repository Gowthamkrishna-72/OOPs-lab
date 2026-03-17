package LAB7;

import java.util.Scanner;

/*
Q.7). Write a program to grade a short multiple choice quiz.the correct answers for the quiz are:

1. C
2. A
3. B
4. D
Assume that the pass marks are 2 out of 4.The program stores the correct answers in an array.the submitted
answers are specifies as program arguments. Let X represents a question that was not answered on the
quiz.Use an enum type to represent the result of answering a question.
The program calculates and prints a report along the following lines:
QUESTION SUBMITTED ANS CORRECT ANS RESULT
1 C C CORRECT
2 B A WRONG
3 B B CORRECT
4 D D CORRECT

No. of correct answers: 3
No: of wrong answers. 1
The candidate passed.
*/

enum Result
{
    CORRECT, WRONG, NOT_ANSWERED;
}

public class L77 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char[] correctAnswers = { 'C', 'A', 'B', 'D' };
        char[] submittedAnswers = new char[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter answer for Question " + (i + 1) + " (A/B/C/D or X): ");
            submittedAnswers[i] = sc.next().toUpperCase().charAt(0);
        }

        int correctCount = 0;
        int wrongCount = 0;

        System.out.println("\nQUESTION  SUBMITTED ANS  CORRECT ANS  RESULT");

        for (int i = 0; i < 4; i++) {
            char submitted = submittedAnswers[i];
            char correct = correctAnswers[i];

            Result res;

            if (submitted == 'X') {
                res = Result.NOT_ANSWERED;
                wrongCount++;
            } else if (submitted == correct) {
                res = Result.CORRECT;
                correctCount++;
            } else {
                res = Result.WRONG;
                wrongCount++;
            }

            System.out.printf("%-10d %-15c %-12c %-15s\n", (i + 1), submitted, correct, res);

        }

        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);

        if (correctCount >= 2)
            System.out.println("The candidate passed.");
        else
            System.out.println("The candidate failed.");

        sc.close();
    }    
}