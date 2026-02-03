package CASE_BASE;

import java.util.Scanner;

/*
5. (Geometry: two rectangles) Write a program that prompts the user to enter the center x-, y-
coordinates, width, and height of two rectangles and determines whether the second rectangle

is inside the first or overlaps with the first, as shown in Figure 3.11. Test your program to cover
all cases.
*/

class Rectangle 
{
    double x, y, width, height;

    Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    double left()   { return x - width / 2; }
    double right()  { return x + width / 2; }
    double top()    { return y + height / 2; }
    double bottom() { return y - height / 2; }
}


public class CS5 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r1 center x, y, width, height: ");
        Rectangle r1 = new Rectangle(
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        );

        System.out.print("Enter r2 center x, y, width, height: ");
        Rectangle r2 = new Rectangle(
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        );

        boolean inside =
                r2.left() >= r1.left() &&
                r2.right() <= r1.right() &&
                r2.top() <= r1.top() &&
                r2.bottom() >= r1.bottom();

        boolean overlap =
                r1.right() >= r2.left() &&
                r1.left() <= r2.right() &&
                r1.top() >= r2.bottom() &&
                r1.bottom() <= r2.top();

        if (inside)  
            System.out.println("Rectangle 2 is inside Rectangle 1");
         else if (overlap) 
            System.out.println("Rectangle 2 overlaps Rectangle 1");
        else 
            System.out.println("Rectangle 2 does not overlap Rectangle 1");

        sc.close();
    }
}
