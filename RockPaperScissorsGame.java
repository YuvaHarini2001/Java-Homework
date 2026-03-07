
package rockpaperscissorsgame;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissorsGame 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Random rd = new Random();
        
        int userChoice = 0;
        
        System.out.println("***Menu***");
        
        while(userChoice<1 || userChoice>3)
        {
            System.out.println("Enter your choice:\n1.Rock\n2.Paper\n3.Scissor");
            userChoice = sc.nextInt();
                
            if(userChoice<1 || userChoice>3)
            {
                System.out.println("Invalid Choice - Please enter 1,2,3 only");
            }
        }
        
        int computerChoice = rd.nextInt(3)+1;
        
        System.out.println("--------------------");
        
        System.out.println("User Choice :"+userChoice);
        System.out.println("Computer Choice:"+computerChoice);
        
        System.out.println("********************");
        
        if(userChoice==computerChoice)
        {
            System.out.println("Match:It is a tie");
        }
        else if((userChoice==1&&computerChoice==3)||(userChoice==2&&computerChoice==1)||(userChoice==3&&computerChoice==2))
        {
            System.out.println("Match:User Win");
        }
        else
        {
            System.out.println("Match:Computer Win");
        }
        
        System.out.println("********************");
    }
    
}
