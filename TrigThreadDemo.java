// 3)Program calculate the sin(x) and cos(x) functions by computing  the sin series and  cos series functions using 
// thread techniques.(sin(x) and cos(x) calculate using Math class). 

import java.util.Scanner;

class SinThread implements Runnable {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        double term = x;
        double sum = 0;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            sum += term;
            term = -term * x * x / ((2 * i) * (2 * i + 1));
        }

        System.out.println("Sin(x) using series = " + sum);
        System.out.println("Sin(x) using Math.sin = " + Math.sin(x));
    }
}

class CosThread implements Runnable {
    double x;

    CosThread(double x) {
        this.x = x;
    }

    public void run() {
        double term = 1;
        double sum = 0;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            sum += term;
            term = -term * x * x / ((2 * i - 1) * (2 * i));
        }

        System.out.println("Cos(x) using series = " + sum);
        System.out.println("Cos(x) using Math.cos = " + Math.cos(x));
    }
}

public class TrigThreadDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x (in radians): ");
        double x = sc.nextDouble();

        Thread t1 = new Thread(new SinThread(x));
        Thread t2 = new Thread(new CosThread(x));

        t1.start();
        t2.start();

        sc.close();
    }
}