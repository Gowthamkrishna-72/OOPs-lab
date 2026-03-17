package LAB6;

import java.util.Scanner;

/*
Q.4. Create an abstract class car contains an instance variable .one concrete method and two abstract
method.Maruti and santro are subclass implements the abstrat method of super class and methods are avg() and
mode().Create a class Car1 to use all the features of abstract method by creating a reference to it and referring to
the subclass object.
*/

abstract class Car 
{
    int speed;

    Car(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Car speed: " + speed + " km/h");
    }

    abstract void avg();

    abstract void mode();
}

class Maruti extends Car {
    Maruti(int speed) {
        super(speed);
    }

    public void avg() {
        System.out.println("Maruti average: 22 km/l");
    }

    public void mode() {
        System.out.println("Maruti mode: Petrol");
    }
}

class Santro extends Car
{
    Santro(int speed)
    {
        super(speed);
    }

    public void avg()
    {
        System.out.println("Santro average: 18 km/l");
    }

    public void mode()
    {
        System.out.println("Santro mode: Petrol");
    }
}

public class L64 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the of Speed of Maruti Car : ");
        int spM = sc.nextInt();

        Car c1 = new Maruti(spM);
        c1.showSpeed();
        c1.avg();
        c1.mode();
        
        System.out.print("Enter the of Speed of Santro Car :");
        int spS = sc.nextInt();

        Car c2 = new Santro(spS);
        c2.showSpeed();
        c2.avg();
        c2.mode();

        sc.close();
    }
}
