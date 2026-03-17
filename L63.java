package LAB6;

import java.util.Scanner;
/*
Q.3)Create a washing machine class with methods as switchOn, acceptClothes, acceptDetergent, switchOff.
acceptClothes accepts the noofClothes as argument & returns the no of Clothes.
*/

class WashingMachine
{
    void switchOn()
    {
        System.out.println("Washing Machine is switched ON ");
    }

    int acceptClothes(int noofClothes)
    {
        System.out.println(noofClothes + " clothes accepted");
        return noofClothes;
    }

    void acceptDetergent()
    {
        System.out.println("Detergent accepted ");
    }

    void switchOff()
    {
        System.out.println("Washing Machine is switched OFF ");
    }
}

public class L63
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();

        wm.switchOn();

        System.out.print("Enter the number of clothes : ");
        int clothes = sc.nextInt();

        int returnedClothes = wm.acceptClothes(clothes);
        System.out.println("Returned clothes count: " + returnedClothes);

        wm.acceptDetergent();
        wm.switchOff();

        sc.close();
    }
}