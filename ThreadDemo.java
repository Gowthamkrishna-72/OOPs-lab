// 1)Creation of a thread by extending the thread class the thread is created and started in main method of another 
// class. 

class MyThread extends Thread {

    // Override run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class (separate class)
public class ThreadDemo {
    public static void main(String[] args) {

        // Create thread object
        MyThread t1 = new MyThread();

        // Start thread
        t1.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}