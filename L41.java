package LAB4;

import java.util.Scanner;

/*
Q.1) Demonstrate functionality of 3D matrix using 1D array
void set(int value, int x, int y, int z, int[] arr);
void get(int x, int y, int z, int[] arr);
*/

class Matrix3D_Using1D 
{
    static int X, Y, Z;

    static void set(int value, int indexX, int indexY, int indexZ, int[] arr) 
    {
        int index = indexX * Y * Z + indexY * Z + indexZ;
        arr[index] = value;
    }

    static void get(int indexX, int indexY, int indexZ, int[] arr) 
    {
        int index = indexX * Y * Z + indexY * Z + indexZ;
        System.out.println("Value at [" + indexX + "][" + indexY + "][" + indexZ + "] = " + arr[index]);
    }
}

public class L41 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dimensions X Y Z: ");
        Matrix3D_Using1D.X = sc.nextInt();
        Matrix3D_Using1D.Y = sc.nextInt();
        Matrix3D_Using1D.Z = sc.nextInt();

        int[] arr = new int[Matrix3D_Using1D.X * Matrix3D_Using1D.Y * Matrix3D_Using1D.Z];

        System.out.print("Enter value to set: ");
        int value = sc.nextInt();

        System.out.print("Enter indices x y z: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Matrix3D_Using1D.set(value, x, y, z, arr);

        System.out.print("Enter indices to get value x y z: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        Matrix3D_Using1D.get(x, y, z, arr);

        sc.close();
    }
}
