package LAB5;

import java.util.Scanner;

/*
Q.4) Define a class called fruit with the following attributes :
1. Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and display their attributes.
*/
class Fruit {
    String name;
    String type;
    double price;

    Fruit(String name,String type,double price)
    {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    void displayFruit()
    {
        System.out.println("Name    : " + name);
        System.out.println("Type    : " + type);
        System.out.println("Price   : " + price);
        System.out.println("----------------------");
    }
}

public class L54 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Fruit 1:");

        System.out.print("Name: ");
        String name1 = sc.nextLine();
        
        System.out.print("Type (Single/Bunch): ");
        String type1 = sc.nextLine();
        
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        
        sc.nextLine(); 

        Fruit f1 = new Fruit(name1, type1, price1);

        System.out.println("\nEnter details for Fruit 2:");

        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Type (Single/Bunch): ");
        String type2 = sc.nextLine();
        
        System.out.print("Price: ");
        double price2 = sc.nextDouble();

        Fruit f2 = new Fruit(name2, type2, price2);

        // Displaying details
        System.out.println("\nFruit Details:");
        f1.displayFruit();
        f2.displayFruit();

        sc.close();
    }
}


