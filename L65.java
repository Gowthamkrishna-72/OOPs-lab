package LAB6;

import java.util.Scanner;

/*
Q.5) Create a Bank class with methods deposit & withdraw. The deposit method would accept attributes amount
& balance & returns the new balance which is the sum of amount & balance. Similarly, the withdraw method
would accept the attributes amount & balance & returns the new balance ‘balance – amount’ if balance > =
amount or return 0 otherwise.
*/
class Bank 
{
    double deposit(double amount,double balance)
    {
        System.out.println(" Amount deposited :" + amount);
        balance += amount;
        return balance;
    }
    
    double withdraw(double amount,double balance)
    {
        if (balance >= amount)
        {
            System.out.println(" Amount withrawed :" + amount);
            balance -= amount;
            return balance;
        }
        else
        {
            System.out.println("Insufficient Balance!");
            return 0;        
        }
    }

}
public class L65 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        double amount = sc.nextDouble();

        System.out.print("Enter the balance :");
        double balance = sc.nextDouble();

        System.out.print("1.Deposit\n2.Withdraw ");
        int n = sc.nextInt();

        Bank sbi = new Bank();

        double newBalance=0;
        switch (n) 
        {
            case 1:
                newBalance = sbi.deposit(amount, balance);
                break;
            case 2:
                newBalance = sbi.withdraw(amount, balance);
                break;

            default:
                break;
        }
        System.out.println("New Balance :"+ newBalance);
        sc.close();
    }
}
