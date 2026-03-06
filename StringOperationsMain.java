
package stringoperations;

import java.util.Scanner;


public class StringOperationsMain
{
    public static void main(String[] args)
    {
        StringFunctions sf = new StringFunctions();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        
        int choice;
        
        do
        {
            System.out.println("***Menu***");
            System.out.println("Enter your choice:\n1.Check Length\n2.Check Reversed Name\n3.Check Uppercase\n4.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Length:"+sf.getLength(name));
                    break;
                    
                case 2:
                    System.out.println("Reversed Name:"+sf.reverseName(name));
                    break;
                    
                case 3:
                    System.out.println("UpperCase Name:"+sf.upperName(name));
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while(choice!=4);
    }
    
}
