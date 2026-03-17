package LAB6;

import java.util.Scanner;

/*
Q.6) Create a class to model a point in 3D space. Data members x,y,z as coordinate of 3D point are of type int.
Constructors: To create 3D point represented the origin arbitrary point. Methods:
 i/p the coordinates of 3D point.
 o/p the coordinate of 3D point in the form(x,y,z).
 Compute distance between two points.
*/
class Point3D 
{
    int x, y, z;
    Point3D()
    {
        x = y = z = 0;
    }

    Point3D(int x,int y,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display()
    {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }

    double distance(Point3D p)
    {
        return Math.sqrt( Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2) + Math.pow((p.z - z), 2));
    }
}

public class L66 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Point3D op = new Point3D();

        System.out.print("Enter x :");
        int px = sc.nextInt();
        System.out.print("Enter y :");
        int py = sc.nextInt();
        System.out.print("Enter z :");
        int pz = sc.nextInt();

        Point3D p = new Point3D(px, py, pz);

        System.out.print("Point 1 (Origin):");
        op.display();

        System.out.print("Point 2:");
        p.display();

        double dist = op.distance(p);
        System.out.print("Dist Btw 2 points :" + dist);

        sc.close();    
    }   
}
