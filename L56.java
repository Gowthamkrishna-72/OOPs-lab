package LAB5;

/*
Q.6 Createa class called Student which has the following methods:
i). Average: which would accept marks of 3 examinations & return whether the student has passed or failed
Depending on whether he has scored an average above 50 or not.
ii). Input name: which would accept the name of the student & returns the name.
*/

import java.util.Scanner;

class Student
{
    String inputName(String name)
    {
        return name;
    }

    String average(int m1, int m2, int m3)
    {
        double avg = (m1 + m2 + m3) / 3.0;

        if (avg > 50)
            return "Pass";
        else
            return "Fail";
    }
}

public class L56
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of 3 exams: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        String studentName = s.inputName(name);
        String result = s.average(m1, m2, m3);

        System.out.println("\nStudent Name : " + studentName);
        System.out.println("Result       : " + result);

        sc.close();
    }
}
