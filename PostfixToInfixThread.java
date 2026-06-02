// 5) Write a java program to convert the sequence of character AB*CD/+ representing the polish notation to the 
// original expression A*B+C/D .use two thread to perform the evaluation


class ConvertThread extends Thread {
    String postfix;

    ConvertThread(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        String[] stack = new String[postfix.length()];
        int top = -1;

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // If operand
            if (Character.isLetterOrDigit(ch)) {
                stack[++top] = ch + "";
            } 
            // If operator
            else {
                String op2 = stack[top--];
                String op1 = stack[top--];

                String expr = op1 + ch + op2;
                stack[++top] = expr;
            }
        }

        System.out.println("Infix Expression: " + stack[top]);
    }
}

class EvaluateThread extends Thread {
    String postfix;

    EvaluateThread(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        System.out.println("Evaluating expression (simulation): " + postfix);
    }
}

public class PostfixToInfixThread {
    public static void main(String[] args) {

        String postfix = "AB*CD/+";

        ConvertThread t1 = new ConvertThread(postfix);
        EvaluateThread t2 = new EvaluateThread(postfix);

        t1.start();
        t2.start();
    }
}