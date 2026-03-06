
package bankaccountoperations;

import java.util.Scanner;


public class BankAccountOperationsMain
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the initial balance:");
        double balance = sc.nextDouble();
        
        BankAccountFunctions ba = new BankAccountFunctions(balance);
        
        int choice;
        
        do
        {
            System.out.println("***Menu***");
            System.out.println("Enter your choice:\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the deposit amount:");
                    double amount = sc.nextDouble();
                    ba.deposit(amount);
                    System.out.println("Deposited Successfully");
                    break;
                    
                case 2:
                    System.out.println("Enter the withdraw amount:");
                    amount= sc.nextDouble();
                    ba.withdraw(amount);
                    break;
                    
                case 3:
                    System.out.println("Current Balance:"+ba.balance());
                    break;
                    
                case 4:
                    System.out.println("Exiting....");
                    break;
                    
                default:
                    System.out.println("Invalid Choice");
                    break;
                    
            }
        }while(choice!=4);
    }
    
}
