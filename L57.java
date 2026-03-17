package LAB5;

import java.util.Scanner;

/*
Q.7. Write a program to grade a short multiple choice quiz.the correct answers for the quiz are:
1. C 5. B
2. A 6. C
3. B 7. C
4. D 8. A
Assume that the pass marks are 5 out of 8.the program stores the correct answers in an array.the
submitted answers are specifies as program arguments. Let X represents a question that was not
answered on the quiz.Use an enum type to represent the result of answering a question.
The program calculates and prints a report along the following lines:
QUESTION SUBMITTED ANS CORRECT ANS RESULT
1 C C CORRECT
2 B A WRONG
3 B B CORRECT
4 D D CORRECT
5 B B CORRECT
6 C C CORRECT
7 A C WRONG
8 X A UNANSWERED

No. of correct answers: 5
No: of wrong answers. 2
No of questions unanswered: 1
*/
enum Result 
{
    CORRECT, WRONG, UNANSWERED
}

public class L57 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        char[] correctAnswers = { 'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A' };
        char[] submittedAnswers = new char[8];

        System.out.println("Enter answers for 8 questions (use X if unanswered):");

        for (int i = 0; i < 8; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            String input = sc.next().toUpperCase();
            submittedAnswers[i] = input.charAt(0);
        }

        int correctCount = 0, wrongCount = 0, unansweredCount = 0;

        System.out.println("\nQUESTION  SUBMITTED  CORRECT  RESULT");

        for (int i = 0; i < 8; i++) {
            Result result;

            if (submittedAnswers[i] == 'X') {
                result = Result.UNANSWERED;
                unansweredCount++;
            } else if (submittedAnswers[i] == correctAnswers[i]) {
                result = Result.CORRECT;
                correctCount++;
            } else {
                result = Result.WRONG;
                wrongCount++;
            }

            System.out.printf("%-9d %-9c %-8c %s%n", i + 1, submittedAnswers[i], correctAnswers[i], result);
        }

        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of questions unanswered: " + unansweredCount);

        sc.close();
    }
}
