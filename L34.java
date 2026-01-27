package L34.FigPackage;

/*
create a package named FigPackage. Define an abstract class called figure having the following attribute
r,a,v and pi of the datatype double.the attribute pi must have a value equal to 3.1428.must have the following

abstract method-
public abstract void calcArea(); public abstract void calcVolume();

public abstract void dispArea();public abstract void dispVolume();
design three classes cone,sphere,cylinder. each of these class must extends the Figure class

class name Attribute
Cone n,s of type double
Sphere
Cylinder n of the type double

the formulae for the area and volume of the cone,cylinder and sphere are as follows:
Class Formal
cone area=(pi*r*s)+(pi*r*r)
volume=(pi*r*v*h)/3
Sphere area=(4*pi*r*r)
volume=(4*pi*r*r*r)/3
Cylinder area=(2*pi*r*r)+(2*pi*r*h)
volume=pi*r*r*h

define the inherited abstract method in the subclass by using the given formulae and set values of inherited
attribute a and v for the rea and volume ,respectively define any constructor /method that may be necessary.
write a main method in a class called Demo and invoke the method of each subclass. all the created class must be
put in the fig Package compile and execute program at command prompt.
*/


abstract class Figure
{
    protected double r,a,v; 
    protected final double pi = 3.1428;

    public abstract void calcArea();

    public abstract void calcVolume();

    public abstract void dispArea();

    public abstract void dispVolume();
}
class Cone extends Figure 
{
    private double n; // height
    private double s; // slant height

    public Cone(double r, double n, double s) {
        this.r = r;
        this.n = n;
        this.s = s;
    }

    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

    public void calcVolume() {
        v = (pi * r * r * n) / 3;
    }

    public void dispArea() {
        System.out.println("Cone Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Cone Volume = " + v);
    }
}

class Sphere extends Figure 
{
    public Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 * pi * r * r;
    }

    public void calcVolume() {
        v = (4 * pi * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Sphere Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Sphere Volume = " + v);
    }
}

class Cylinder extends Figure
{
    private double n; // height

    public Cylinder(double r, double n)
    {
        this.r = r;
        this.n = n;
    }

    public void calcArea()
    {
        a = (2 * pi * r * r) + (2 * pi * r * n);
    }

    public void calcVolume()
    {
        v = pi * r * r * n;
    }

    public void dispArea()
    {
        System.out.println("Cylinder Area = " + a);
    }

    public void dispVolume()
    {
        System.out.println("Cylinder Volume = " + v);
    }
}

public class L34 
{
    public static void main(String[] args)
    {
        Cone c = new Cone(3, 5, 6);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        System.out.println();

        Sphere s = new Sphere(4);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        System.out.println();

        Cylinder cy = new Cylinder(3, 7);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}

