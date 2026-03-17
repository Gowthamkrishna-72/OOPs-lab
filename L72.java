package LAB7;

import java.util.Scanner;

/*
Q.2)Write a class vehicle .Define suitable attributes and methods. Write subclasses of Vehicle like Car, Bicycle,
Scooter.
Assume suitable required attributes. Write constructor for each and define a method maxSpeed() in each
class
Which prints the maximum speed of the vehicle? (Use of super keyword is expected in the constructor of
inherited classes).
*/
class Vehicle
{
    String brand;
    int year;

    Vehicle(String brand, int year)
    {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle
{
    int speed;

    Car(String brand, int year, int speed)
    {
        super(brand, year);
        this.speed = speed;
    }

    void maxSpeed()
    {
        System.out.println("Car Maximum Speed: " + speed + " km/h");
    }
}

class Bicycle extends Vehicle
{
    int speed;

    Bicycle(String brand, int year, int speed)
    {
        super(brand, year);
        this.speed = speed;
    }

    void maxSpeed()
    {
        System.out.println("Bicycle Maximum Speed: " + speed + " km/h");
    }
}

class Scooter extends Vehicle
{
    int speed;

    Scooter(String brand, int year, int speed)
    {
        super(brand, year);
        this.speed = speed;
    }

    void maxSpeed()
    {
        System.out.println("Scooter Maximum Speed: " + speed + " km/h");
    }
}

public class L72
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Details:");
        System.out.print("Enter car brand :");
        String cb = sc.nextLine();
        System.out.print("Enter car year :");
        int cy = sc.nextInt();
        System.out.print("Enter Car speed :");
        int cs = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Bicyclce Details:");
        System.out.print("Enter Bicyclce brand :");
        String bb = sc.nextLine();
        System.out.print("Enter Bicyclce year :");
        int by = sc.nextInt();
        System.out.print("Enter Bicyclce speed :");
        int bs = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Scooter Details:");
        System.out.print("Enter Scooter brand :");
        String sb = sc.nextLine();
        System.out.print("Enter Scooter year :");
        int sy = sc.nextInt();
        System.out.print("Enter Scooter speed :");
        int ss = sc.nextInt();

        Car c = new Car(cb,cy,cs);
        Bicycle b = new Bicycle(bb,by,bs);
        Scooter s = new Scooter(sb,sy,ss);

        sc.close();

        System.out.println("Car Details:");
        c.displayInfo();
        c.maxSpeed();

        System.out.println("\nBicycle Details:");
        b.displayInfo();
        b.maxSpeed();

        System.out.println("\nScooter Details:");
        s.displayInfo();
        s.maxSpeed();
    }
}


