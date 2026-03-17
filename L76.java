package LAB7;

import java.util.Scanner;

/*
Q.6)Define a class named Course having data members ID, Description, Duration and Fees. The class should have
one parametrized constructors and GetData() function member to display the data. Create an array of 5 course
objects and then display the data for all of them.
*/

class Course 
{
    int memberID;
    String description;
    int duration;
    double fees;

    Course(int memberID,String description,int duration, double fees)
    {
        this.memberID = memberID;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void GetData()
    {
        System.out.println("Course ID: " + memberID);
        System.out.println("Description: " + description);
        System.out.println("Duration (months): " + duration);
        System.out.println("Fees: " + fees);
        System.out.println("----------------------------");
    }
}
public class L76 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Courses :");
        int n = sc.nextInt();

        Course[] cr = new Course[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the Details of Course " + (i+1));
            System.out.print("Enter the CourseID :");
            int crid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the courseDescription :");
            String crDes = sc.nextLine();
            System.out.print("Enter the CourseDuration in months :");
            int crduration = sc.nextInt();
            System.out.print("Enter the courseFee :");
            double crfee = sc.nextDouble();

            cr[i] = new Course(crid, crDes, crduration, crfee);
            System.out.println();
        }


        System.out.println("Course Details:");
        for (int i = 0; i < n; i++)
        {
            cr[i].GetData();
        }

        sc.close();
    }
}
