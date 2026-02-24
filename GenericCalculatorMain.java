
package genericcalculator;

import java.util.Scanner;


public class GenericCalculatorMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Calculator<Integer> cal = new Calculator();
        Calculator<Double> cal1 = new Calculator();
        
        int choice;
        
        do
        {
            System.out.println("***Menu***");
            System.out.println("Enter your choice:\n1.Add\n2.Subtract\n3.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the number 1:");
                    int num1 = sc.nextInt();
                    System.out.println("Enter the number 2:");
                    int num2 = sc.nextInt();
                    
                    System.out.println("Add Value:"+cal.add(num1, num2));
                    break;
                    
                case 2:
                    System.out.println("Enter the number 1:");
                    double n1 = sc.nextDouble();
                    System.out.println("Enter the number2:");
                    double n2 = sc.nextDouble();
                    
                    System.out.println("Sub Value:"+cal1.sub(n1, n2));
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