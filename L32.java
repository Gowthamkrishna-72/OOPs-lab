
import java.util.Scanner;

/*
Q2.) Define an abstract class called Figure having following attribute pi of the data type double. The attribute pi
have a value equal to 3.1420.It must have the following abstract methods .
public abstract void calcArea();public abstract void calcVol();
public abstract void DispArea();public abstract void Dispvol();
Design three classes cone , sphere and cylinder. Each of these classes must extend the Figure class
class name Attribute
Cone n,s of type double
Sphere R
cylinder h of type double
Define the inherited abstract methods in the subclass by using the given formulae and set the value of the
inherited attribute a and v for area and volume, rspe. Define any constructor /method that may be necessary.
Write a main method in a class called Demo and invoke the methods of each subclass.
*/
abstract class Figure2 
{
    double a,v;
    double pi = 3.1420;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}

class Cone2 extends Figure2 
{
    double r, h, s;

    Cone2(double r, double h, double s)
    {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea()
    {
        a = (pi * r * s) + (pi * r * r);
    }

    public void calcVolume()
    {
        v = (pi * r * r * h) / 3;
    }

    public void dispArea()
    {
        System.out.println("Cone Area : " + a);
    }

    public void dispVolume()
    {
        System.out.println("Cone Volume : " + v);
    }
}

class Sphere extends Figure2 
{
    double r;

    Sphere(double r) 
    {
        this.r = r;
    }

    public void calcArea() 
    {
        a = 4 * pi * r * r;
    }

    public void calcVolume() 
    {
        v = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() 
    {
        System.out.println("Sphere Area : " + a);
    }

    public void dispVolume() 
    {
        System.out.println("Sphere Volume : " + v);
    }
}

class Cylinder extends Figure2 
{
    double r, h;

    Cylinder(double r, double h) 
    {
        this.r = r;
        this.h = h;
    }

    public void calcArea() 
    {
        a = (2 * pi * r * h) + (2 * pi * r * r);
    }

    public void calcVolume() 
    {
        v = pi * r * r * h;
    }

    public void dispArea() 
    {
        System.out.println("Cylinder Area : " + a);
    }

    public void dispVolume() 
    {
        System.out.println("Cylinder Volume : " + v);
    }
}

public class L32 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Cone 
        System.out.print("Enter cone radius: ");
        double cr = sc.nextDouble();
        System.out.print("Enter cone height: ");
        double ch = sc.nextDouble();
        System.out.print("Enter cone slant height: ");
        double cs = sc.nextDouble();

        Cone2 c = new Cone2(cr, ch, cs);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        // Sphere 
        System.out.print("\nEnter sphere radius: ");
        double sr = sc.nextDouble();

        Sphere s = new Sphere(sr);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        // Cylinder 
        System.out.print("\nEnter cylinder radius: ");
        double cyr = sc.nextDouble();
        System.out.print("Enter cylinder height: ");
        double cyh = sc.nextDouble();

        Cylinder cy = new Cylinder(cyr, cyh);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();

        sc.close();
    }
}
