// 7) A bank account is operated by a father and his son. the account is opened with an initial deposit of Rs. 600. 
// Thereafter, the father deposits a random amount between Rs. 1 and Rs. 200 each time, until the account balance 
// crosses Rs. 2000.the son can start withdraws random amount only if the balance exceeds Rs. 2000.thereafter,the 
// son withdraws random amount between Rs 1 and Rs. 150, until the balance goes below Rs. 500. Once the 
// balances become less than Rs. 500, the father deposits amount till it crosses Rs. 2,000 and the process continues. 
// Write a Father Deposits amount till it crosses Rs. 2000 and the process continues. Write a father and son thread 
// to carry out the above process.


class BankAccount {
    private int balance = 600;

    // Deposit method (Father)
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Father deposits: " + amount + " | Balance: " + balance);
        notify(); // notify waiting thread
    }

    // Withdraw method (Son)
    public synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println("Son withdraws: " + amount + " | Balance: " + balance);
        notify();
    }

    public int getBalance() {
        return balance;
    }
}

class Father extends Thread {
    BankAccount acc;

    Father(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        try {
            while (true) {
                synchronized (acc) {

                    // Deposit until balance > 2000
                    while (acc.getBalance() <= 2000) {
                        int amount = (int)(Math.random() * 200) + 1;
                        acc.deposit(amount);
                        Thread.sleep(200);
                    }

                    // Wait if balance already high
                    acc.wait();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Son extends Thread {
    BankAccount acc;

    Son(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        try {
            while (true) {
                synchronized (acc) {

                    // Start withdrawing only if balance > 2000
                    while (acc.getBalance() > 500) {
                        if (acc.getBalance() > 2000) {
                            int amount = (int)(Math.random() * 150) + 1;
                            acc.withdraw(amount);
                            Thread.sleep(200);
                        } else {
                            break;
                        }
                    }

                    // Wait when balance is low
                    acc.wait();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class BankThreadDemo {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Father f = new Father(acc);
        Son s = new Son(acc);

        f.start();
        s.start();
    }
}