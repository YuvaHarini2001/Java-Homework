
package onlinelaptopordersystem;

import java.util.Scanner;

public class OnlineLaptopOrderSystemMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the brand:");
        String brand = sc.nextLine();
        System.out.println("Enter the ram:");
        String ram = sc.nextLine();
        
        System.out.println("Enter the ssd (true/false):");
        boolean ssd = sc.nextBoolean();
        System.out.println("Enter the graphics card (true/false):");
        boolean graphicsCard = sc.nextBoolean();
        System.out.println("Enter the extended warranty (true/false):");
        boolean extendedWarranty = sc.nextBoolean();
        System.out.println("Enter the ms office installed (true/false):");
        boolean msOfficeInstalled = sc.nextBoolean();
        
        LaptopOrder lo = new LaptopOrder.LaptopBuilder(brand, ram, ssd, graphicsCard, extendedWarranty, msOfficeInstalled).setBrand(brand).setRam(ram).addSsd(ssd).addGraphicsCard(graphicsCard).addExtendedWarranty(extendedWarranty).addMsOfficeInstalled(msOfficeInstalled).build();
        lo.display();
    }
    
}
