
package Interface;

import java.util.Scanner;


public class InterfaceMain {

    public static void main(String[] args) 
    {
        FoodOrder fo = new FoodOrder();
        
        Scanner sc = new Scanner(System.in);
        int choice;
        int index = 0;
        
        do
        {
                System.out.println("*******Menu*****");
                System.out.println("Enter your choice\n1.Place Order\n2.View Bill\n3.Exit");
                choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    fo.placeOrder();
                    break;
                    
                case 2:
                    fo.showBill();
                    break;
                   
                case 3:
                    System.out.println("Exit");
                    break;
                    
            }
        }while(choice!=4);
    }
    
}
