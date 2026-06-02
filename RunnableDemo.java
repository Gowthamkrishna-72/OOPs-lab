// 2) Creation of a thread by implementing the interface Runnable interface the thread is created and stared by the 
// constructor of same class. 

class MyRunnable implements Runnable {

    Thread t;

    // Constructor
    MyRunnable() {
        // Create thread object and pass current class object
        t = new Thread(this);

        // Start thread inside constructor
        t.start();
    }

    // Override run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class RunnableDemo {
    public static void main(String[] args) {

        // Creating object automatically creates & starts thread
        new MyRunnable();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}