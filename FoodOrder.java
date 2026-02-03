
package Interface;

import java.util.Scanner;


public class FoodOrder extends Customer implements Order
{
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    String foodName;
    int price;
    
    FoodOrder()
    {
        this.foodName = foodName;
        this.price = price;
    }

    @Override
    public void placeOrder()
    {
       System.out.println("Enter the customer name:");
       member = sc.nextLine();
       System.out.println("Enter the food name:");
       foodName = sc.nextLine();
       System.out.println("Enter the Food price:");
       price = sc1.nextInt();
    }

    @Override
    public void showBill()
    {
        System.out.println("Customer Name:"+member);
        System.out.println("Food Item:"+foodName);
        System.out.println("Price:"+price);
        
        
        System.out.println("Order Placed Successfully");
    }
    
}
