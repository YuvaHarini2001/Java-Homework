
package trafficsignalsystem;

import java.util.Scanner;


public class TrafficSignalSystemMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do
        {
            System.out.println("***Menu****");
            System.out.println("Enter your choice:\n1.Show Signal Meaning\n2.Check Stop or Go\n3.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the signal colour (RED,YELLOW,GREEN):");
                    String colour = sc.nextLine();
                    EnumTrafficSignalSystem tr = EnumTrafficSignalSystem.valueOf(colour.toUpperCase());
                    
                    if(tr==EnumTrafficSignalSystem.RED)
                    {
                        System.out.println("Meaning: STOP");
                    }
                    else if(tr==EnumTrafficSignalSystem.YELLOW)
                    {
                        System.out.println("Meaning: WAIT");
                    }
                    else
                    {
                        System.out.println("Meaning: GO");
                    }
                    break;
                    
                case 2:
                    System.out.println("Enter the signal colour (RED,YELLOW,GREEN): ");
                    colour = sc.nextLine();
                    EnumTrafficSignalSystem tr1 = EnumTrafficSignalSystem.valueOf(colour.toUpperCase());
                    
                    if(tr1==EnumTrafficSignalSystem.RED)
                    {
                        System.out.println("Action: STOP");
                    }
                    else
                    {
                        System.out.println("Action: GO");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exit");
                    break;
                
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while(choice!=3);
    }
    
}
