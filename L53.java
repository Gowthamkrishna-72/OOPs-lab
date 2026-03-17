package LAB5;

import java.util.Scanner;

/*
Q.3) Create Product having following attributes: Product ID, Name, Category ID and UnitPrice. Create
ElectricalProduct having the following additional attributes: VoltageRange and Wattage. Add a behavior to
change the Wattage and price of the electrical product. Display the updated ElectricalProduct details.
*/

class Product 
{
    int id;
    String name;
    int categoryId;
    double unitPrice;

    Product(int id, String name, int categoryId, double unitPrice) 
    {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    void displayProduct() 
    {
        System.out.println("Product ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Category ID  : " + categoryId);
        System.out.println("Unit Price   : " + unitPrice);
    }
}

class ElectricalProduct extends Product
{
    String volRange;
    int wattage;
    
    ElectricalProduct(int id, String name, int categoryId, double unitPrice,String volRange, int wattage ) 
    {
        super(id, name, categoryId, unitPrice);
        this.volRange = volRange;
        this.wattage = wattage;
    }

    void updateDetails(int newWattage, double newPrice)
    {
        wattage = newWattage;
        unitPrice = newPrice;
    }

    void displayElectricalProduct()
    {
        displayProduct();
        System.out.println("Voltage Range: " + volRange);
        System.out.println("Wattage      : " + wattage+ "W");
    }
}

public class L53 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the id :");
        int id = sc.nextInt();

        System.out.print("Enter the Product Name :");
        String name = sc.next();
        
        System.out.print("Enter the Category id :");
        int catId = sc.nextInt();

        System.out.print("Enter the UnitPrice :");
        double UnitPrice = sc.nextDouble();

        System.out.print("Enter the VoltageRange :");
        String vollrange = sc.next();
        

        System.out.print("Enter the wattage :");
        int Watt = sc.nextInt();
        
        ElectricalProduct ep = new ElectricalProduct(id, name, catId, UnitPrice, vollrange,Watt );

        System.out.println("Before Update:");
        ep.displayElectricalProduct();

        System.out.print("Enter the newWattage :");
        int newWatt = sc.nextInt();

        System.out.print("Enter the newUnitPrice :");
        double newUnitPrice = sc.nextDouble();

        ep.updateDetails(newWatt, newUnitPrice);

        System.out.println("\nAfter Update:");
        ep.displayElectricalProduct();
        sc.close();
    }
}
