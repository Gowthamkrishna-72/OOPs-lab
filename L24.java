/*
Q4.) Create a class called date that include three instance variable a) month(type int) b)day (type int) and c) year
(type int) . provide a constructer that initialize a three instance variable and assume the value provided are
correct. Provide a set and a get method for each instance variable.Provide a method DisplayDate that display the
month year and day separated by forward slashand write a test application named DateTest that demonstrate
date capabilities.
*/

import java.util.Scanner;

class Date
{
    int month;
    int day;
    int year;

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    // setter 
    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    // setter
    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public int getYear()
    {
        return year;
    }

    public void displayDate()
    {
        System.out.println(month + "/" + day + "/" + year);
    }
}
public class L24 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month : ");
        int mon = sc.nextInt(); 

        System.out.print("Enter the day : ");
        int day = sc.nextInt();

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        Date d1 = new Date(mon, day, year);
        
        System.out.print("Date is : ");
        d1.displayDate();

        //
        System.out.print("Enter the month to be update : ");
        int mon1 = sc.nextInt(); 

        System.out.print("Enter the day month to be update : ");
        int day1 = sc.nextInt();

        System.out.print("Enter the year month to be update : ");
        int year1 = sc.nextInt();

        sc.close();
         
        d1.setMonth(mon1);
        d1.setDay(day1);
        d1.setYear(year1);

        System.out.print("Updated Date is: ");
        d1.displayDate();
    }
}
