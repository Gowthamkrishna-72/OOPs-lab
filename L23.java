/*
Q3.)Create a class called employee that include three instance variable a)name(type string) b) last name (type
string) and c) monthly salary(double). Provide a constructor that initialize the three instance variable. Provide a
set and a get method of instance variable. if the monthly salary is not positive do not set its value. Write a test
aplication named employeetest that demonstrate class employee capabilities.create two employee object and
display each object yearly salary. Then give each employee a 10% hike and display each employee yearly salary
again.
*/

import java.util.Scanner;

class Employee 
{
    String name;
    String lastName;
    double monthlySalary;

    public Employee(String name,String lastName,double monthlySalary)
    {
        this.name = name;
        this.lastName = lastName;
        if (monthlySalary > 0)
            this.monthlySalary=monthlySalary ;
        else
            this.monthlySalary = 0;
    }
    // setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) 
    {
        if (monthlySalary > 0)
            this.monthlySalary=monthlySalary ;
        else
            this.monthlySalary = 0;
    }

    // getters
    public String getName()
    {
        return name;
    }
    public String getLastName() 
    {
        return lastName;
    }

    public double getMonthlySalary() 
    {
        return monthlySalary;
    }

    //
    double getYearlySalary()
    {
        return monthlySalary * 12;
    }
}
public class L23 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" -------Enter deatils employee 1 " );
        System.out.print("Enter the emp1 name :");
        String name1 = sc.nextLine();

        System.out.print("Enter the emp1 lastName :");
        String lastName1 = sc.nextLine();

        System.out.print("Enter the emp1 monthlySalary :");
        double monthlySalary1 = sc.nextDouble();

        sc.nextLine();

        System.out.println(" -------Enter deatils employee 2 " );
        System.out.print("Enter the emp1 name :");
        String name2 = sc.nextLine();

        System.out.print("Enter the emp1 lastName :");
        String lastName2 = sc.nextLine();

        System.out.print("Enter the emp1 monthlySalary :");
        double monthlySalary2 = sc.nextDouble();

        sc.close();

        Employee emp1 = new Employee(name1, lastName1,monthlySalary1 );
        Employee emp2 = new Employee(name2, lastName2, monthlySalary2);

        System.out.println("\nYearly Salary Before 10% Hike:");
        System.out.println("Employee 1 Yearly Salary : "+emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary : " + emp2.getYearlySalary());
        
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        System.out.println("\nYearly Salary After 10% Hike:");
        System.out.println("Employee 1: " + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.getYearlySalary());
    }
}
