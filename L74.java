package LAB7;

import java.util.Scanner;

/*
Q.4) Write a program to use ‘extends’ keyword to create student class by reusing Teacher class code.We should
write only additional members in student class whih are not available in Teacher class.
*/

class Teacher 
{
    String name;
    int age;
    String subject;

    Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}


class Student extends Teacher
{
    int rollNo;
    String course;

    Student(String name, int age, String subject, int rollNo, String course)
    {
        super(name, age, subject);   
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent()
    {
        displayTeacher();  
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class L74 
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student s = new Student(name, age, subject, roll, course);

        System.out.println("\nStudent Details:");
        s.displayStudent();

        sc.close();
    }    
}
