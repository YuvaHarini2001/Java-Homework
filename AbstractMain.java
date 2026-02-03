
package Abstract;

import java.util.Scanner;

public class AbstractMain 
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.println("*********Menu********");
            System.out.println("Enter your choice\n1.Circle\n2.Square\n3.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the radius:");
                    double member = sc.nextDouble();
                    Circle cr = new Circle(member);
                    cr.calculateArea();
                    break;
                    
                case 2:
                    System.out.println("Enter the radius:");
                    member = sc.nextDouble();
                    Square sq = new Square(member);
                    sq.calculateArea();
                    break;
                    
                case 3:
                    System.out.println("Exit");
                    break;
            }
        }while(choice!=3);
    }
}
