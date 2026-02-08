
package singulylinkedlist;

import java.util.Scanner;


public class SingulyLinkedListMain {

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice;
        
        ShoppingCart s = new ShoppingCart();
        
        do
        {
            System.out.println("*******Menu*******");
            System.out.println("Enter the choice:\n1.Add product to cart\n2.View Card items\n3.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the product id:");
                    int productId = sc.nextInt();
                    System.out.println("Enter the product name:");
                    String productName = sc1.nextLine();
                    System.out.println("Enter the price:");
                    double price =sc.nextDouble();
                    s.insertion(productId, productName, price);
                    break;
                    
                case 2:
                    s.display();
                    break;
                    
                case 3:
                    System.out.println("Exit");
                    break;
            }
        }while(choice!=3);
    }
    
}
