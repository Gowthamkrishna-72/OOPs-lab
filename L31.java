
/*
Q1.)Design a class called figure . It must have three attributes r,aand v of the data type douoble.It must have the
following methods:
public void dispArea(); public void dispVolume();
The method dispArea must have a statement to print the volume of a. The method dispVolume();
must have a statement to print the value of v.Design a class cone . It must extends class figure class .It must also
have the following attributes h,s of type double.It must have following methods:
public void calcArea();public void calcVolume();
The formulae for the area and volume of the cone are as follows:
Area of a cone(p*r*s)+(p*r*s)
volume of a con=(p*r*s)/3
Write a main method in a class called inheritance demo to demonstrate inheritance.
*/
import java.util.Scanner;

class Figure
{
    double r, a, v;

    public void dispArea()
    {
        System.out.println("Area : " + a);
    }

    public void dispVolume()
    {
        System.out.println("Volume : " + v);
    }
}

class Cone extends Figure
{
    double h, s;

    public void calcArea()
    {
        a = (Math.PI * r * s) + (Math.PI * r * r);
    }

    public void calcVolume()
    {
        v = (Math.PI * r * r * h) / 3;
    }
}

public class L31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Cone c = new Cone();

        System.out.print("Enter the radius r: ");
        c.r = sc.nextDouble();

        System.out.print("Enter the height h: ");
        c.h = sc.nextDouble();

        System.out.print("Enter the slant height s: ");
        c.s = sc.nextDouble();

        c.calcArea();
        c.calcVolume();

        c.dispArea();
        c.dispVolume();

        sc.close();
    }
}
