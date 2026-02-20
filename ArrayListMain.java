
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListMain 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> al = new ArrayList<>();
        
        int choice;
        
        do
        {
            System.out.println("Menu");
            System.out.println("Enter your choice:\n1.Enter the vaue\n2.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the value:");
                    int value = sc.nextInt();
                    al.add(value);
                    break;
                    
                case 2:
                    System.out.println("Exit");
                    break;
                    
                default:
                    System.out.println("Ivalid choice");
                    break;
            }
        }while(choice!=2);
        
        int sum = 0;
        
        for(int values:al)
        {
            sum = sum+values;
        }
        
        System.out.println("Sum of the values entered:"+sum);
    }
    
}
