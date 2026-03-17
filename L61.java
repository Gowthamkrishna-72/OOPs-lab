package LAB6;

import java.util.Scanner;

/*
Q.1). Demonstrate the use of ‘super’ and this keyword(constructor changing)

a) To refer to a member of super class.
b) To call super class constructor from sub class constructor.
*/

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person
{
    int rollNo;

    Student(String name, int age, int rollNo)
    {
        super(name, age);
        this.rollNo = rollNo;  
    }

    void showDetails()
    {
        super.display();  
        System.out.println("Roll No: " + rollNo);
    }

}

public class L61 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Name:");
        String name = sc.nextLine();
        System.out.print("Enter Student age:");
        int age = sc.nextInt();
        System.out.print("Enter Student roll NO:");
        int rollNo = sc.nextInt();       

        Student s = new Student(name,age,rollNo);
        s.showDetails();
        sc.close();
    }
}
