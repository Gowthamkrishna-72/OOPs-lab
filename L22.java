/*
Q2.) Create a class called invoice that hardware store might use to represent an invoice for an item sold at the
store. An invoice should include four pieces of information as instance variable

 a part number(type string)
 a part description(type string)
 a quantity of the item being purchased(type int)
 a price per item(double)

Your class should have a constructor that initialization the four instance variable . Provide a set and a get method
for each instance variable . In addition provide method named getInvoiceAmount that calculate the invoice
amount(i.e. multiplies the quantity per item ), then return the amount as a double value.If the quantity is not
positive it should be set to 0. If the price per item is not positive it should be set to 0.0. Write test application
named invoice test that demonstration class invoice capabilities.
*/

import java.util.Scanner;

class Invoice 
{
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    // constructor
    public Invoice (String partNumber,String partDescription,int quantity,double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0;
    }

    // setters
    public void setPartNumber(String partNumber) 
    {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) 
    {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) 
    {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    public void setPricePerItem(double pricePerItem) 
    {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    // Getters
    public String getPartNumber() 
    {
        return partNumber;
    }

    public String getPartDescription() 
    {
        return partDescription;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public double getPricePerItem() 
    {
        return pricePerItem;
    }

    //
    double getInvoiceAmount()
    {
        return pricePerItem * quantity;
    }
}
public class L22 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of invoices :");
        int n = sc.nextInt();

        sc.nextLine(); // consumes new line

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println(" -------Enter deatils for invoice " + i+1);
            System.out.print("Enter the part number :");
            String partNumber = sc.nextLine();

            System.out.print("Enter the part Description :");
            String partDescription = sc.nextLine();

            System.out.print("Enter the quantity :");
            int quantity = sc.nextInt();

            System.out.print("Enter the price per item :");
            double pricePerItem = sc.nextDouble();

            sc.nextLine();

            invoices[i]= new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }
        sc.close();
        for (int i = 0; i < n; i++)
        {
            System.out.println("\n------ Invoice " + (i + 1) + " ------");
            System.out.println("Part Number     : " + invoices[i].getPartNumber());
            System.out.println("Description     : " + invoices[i].getPartDescription());
            System.out.println("Quantity        : " + invoices[i].getQuantity());
            System.out.println("Price per Item  : " + invoices[i].getPricePerItem());
            System.out.println("Invoice Amount  : " + invoices[i].getInvoiceAmount());
        }
    }
}
