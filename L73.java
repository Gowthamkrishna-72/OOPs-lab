package LAB7;

import java.util.Scanner;

/*
Q.3)Create Book having following attributes: Book ID, Title, Author and Price. Create Periodical which has the
following additional attributes: Period (weekly, monthly etc...) .Add a behavior to modify the Price and the Period
of the periodical. Display the updated periodical details.
*/

class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Periodical extends Book
{
    String period; 

    Periodical(int bookId, String title, String author, double price, String period)
    {
        super(bookId, title, author, price);  
        this.period = period;
    }

    void modifyPrice(double newPrice)
    {
        this.price = newPrice;
    }

    void modifyPeriod(String newPeriod)
    {
        this.period = newPeriod;
    }

    void displayPeriodical()
    {
        displayBook();
        System.out.println("Period: " + period);
    }
}

public class L73 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Period (weekly/monthly): ");
        String period = sc.nextLine();

        Periodical p = new Periodical(id, title, author, price, period);

        System.out.println("\nOriginal Details:");
        p.displayPeriodical();


        System.out.print("\nEnter new Price: ");
        double newPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter new Period: ");
        String newPeriod = sc.nextLine();

        p.modifyPrice(newPrice);
        p.modifyPeriod(newPeriod);

        System.out.println("\nUpdated Periodical Details:");
        p.displayPeriodical();

        sc.close();
    }
}
