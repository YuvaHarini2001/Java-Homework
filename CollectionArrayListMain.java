
package collectionarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class CollectionArrayListMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        ArrayList<Acer> al = new ArrayList<>();
        
        int choice;
        
        do
        {
            System.out.println("*****Menu*****");
            System.out.println("Enter your choice:\n1.Enter the details\n2.Search laptop model\n3.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the laptop model:");
                    String laptopModel = sc1.nextLine();
                    System.out.println("Enter the colour of laptop:");
                    String laptopColour = sc1.nextLine();
                    System.out.println("Enter the rgb_Keyboard (true/false):");
                    boolean rgb_Keyboard = sc1.nextBoolean();
                    sc1.nextLine();
                    System.out.println("Enter the processor:");
                    String processor = sc1.nextLine();
                    System.out.println("Enter the price:");
                    int price = sc.nextInt();
                    
                    al.add(new Acer(laptopModel,laptopColour,rgb_Keyboard,processor,price));
                    break;
                    
                case 2:
                    System.out.println("Enter the laptop name:");
                    String searchName = sc1.nextLine();
                    boolean found = false;
                    
                    for(Acer laptopDetails: al)
                    {
                        if(laptopDetails.laptopModel.equals(searchName))
                        {
                            laptopDetails.display();
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Laptop Name not found");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exit");
                    break;
                    
                default:
                    System.out.println("Ivalid choice");
                    break;
            }
        }while(choice!=3);
    }
    
}
