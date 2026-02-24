
package genericstoragebox;

import java.util.Scanner;


public class GenericStorageBoxMain 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        Box<Integer> num = new Box();
        Box<String> name = new Box();
        
        int choice;
        
        do
        {
            System.out.println("***Menu***");
            System.out.println("Enter your choice:\n1.store Integer\n2.store string\n3.Display value\n4.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the numbers:");
                    int values = sc.nextInt();
                    num.setValue(values);
                    break;
                    
                case 2:
                    System.out.println("Enter the names:");
                    String names = sc1.nextLine();
                    name.setValue(names);
                    break;
                    
                case 3:
                    System.out.println("Stored Integer:"+num.getValue());
                    System.out.println("***************");
                    System.out.println("Stored String:"+name.getValue());
                    break;
                    
                case 4:
                    System.out.println("Exit");
                    break;
                    
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            
        }while(choice!=4);
    }
    
}
