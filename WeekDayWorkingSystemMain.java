
package weekdayworkingsystem;

import java.util.Scanner;


public class WeekDayWorkingSystemMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do
        {
            System.out.println("***Menu***");
            System.out.println("Enter your choice:\n1.Check if day is working day\n2.check if day is weekend\n3.display all days\n4.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Day:");
                    String day = sc.nextLine();
                    Days d = Days.valueOf(day.toUpperCase());
                    
                    if(d==Days.SATURDAY||d==Days.SUNDAY)
                    {
                        System.out.println("No, It is a weekend");
                    }
                    else
                    {
                        System.out.println("Yes, Its a working day");
                    }
                    break;
                    
                case 2:
                    System.out.println("Enter the day:");
                    day = sc.nextLine();
                    Days d1 = Days.valueOf(day.toUpperCase());
                    
                    if(d1==Days.SATURDAY||d1==Days.SUNDAY)
                    {
                        System.out.println("Yes, Its a weekend");
                    }
                    else
                    {
                        System.out.println("No, Its a working day");
                    }
                    break;
                    
                case 3:
                    System.out.println("Days:");
                    for(Days days: Days.values())
                    {
                        System.out.println(days);
                    }
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
