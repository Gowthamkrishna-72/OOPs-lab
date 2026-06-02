// 6) Write a java program to compute the first 25 prime numbers. Also compute the first 50 Fibonacci numbers 
// given by fn=fn-1 +fn-2  with f1 =f2=1.create  two thread to compute each one of them .set the priority of thread 
// that compute Fibonacci number to 8 and the other to 5.After calculating 50 Fibonacci number, make that thread 
// to sleep and take up  prime number computation. After computing the 25 prime numbers continue the Fibonacci 
// number computing. 

class FibonacciThread extends Thread {

    public void run() {
        try {
            int f1 = 1, f2 = 1;

            System.out.println("Fibonacci Series:");

            // First 50 Fibonacci numbers
            System.out.print(f1 + " " + f2 + " ");

            for (int i = 3; i <= 50; i++) {
                int fn = f1 + f2;
                System.out.print(fn + " ");
                f1 = f2;
                f2 = fn;
            }

            // Sleep after 50 numbers
            System.out.println("\n\nFibonacci thread sleeping...");
            Thread.sleep(3000);

            // Resume message
            System.out.println("Fibonacci thread resumed after sleep.");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class PrimeThread extends Thread {

    public void run() {
        int count = 0, num = 2;

        System.out.println("\nPrime Numbers:");

        while (count < 25) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        System.out.println("\nPrime computation completed.");
    }
}

public class ThreadNumberDemo {
    public static void main(String[] args) {

        FibonacciThread t1 = new FibonacciThread();
        PrimeThread t2 = new PrimeThread();

        // Set priorities
        t1.setPriority(8);
        t2.setPriority(5);

        // Start Fibonacci first
        t1.start();

        try {
            // Small delay to ensure Fibonacci starts first
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        // Start prime thread
        t2.start();
    }
}