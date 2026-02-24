
package orderstatustracking;

import java.util.Scanner;


public class OrderStatusTrackingMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do
        {
            System.out.println("***Menu***");
            System.out.println("Enter your choice:\n1.Show order status\n2.check if order is completed\n3.Exit");
            choice = sc.nextInt();
            Status st = Status.DELIVERED;

            switch(choice)
            {
                case 1:
                    System.out.println("Status:"+st);
                    break;
                    
                case 2:
                    if(st==Status.DELIVERED)
                    {
                        System.out.println("Order is Completed");
                    }
                    else
                    {
                        System.out.println("No,Its Not yet Completed");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exit");
                    break;
                    
                default:
                    System.out.println("Ivalid Choice");
                    break;
            }
        }while(choice!=3);
    }
    
}
