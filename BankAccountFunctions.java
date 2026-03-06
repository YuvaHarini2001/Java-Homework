
package bankaccountoperations;


public class BankAccountFunctions 
{
    private double balance;

    public BankAccountFunctions(double balance)
    {
        this.balance = balance;
    }
    
    public double deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
        }
        return balance;
        
    }
    
    public double withdraw(double amount)
    {
        if(amount<=balance && amount>0)   
        {
            balance = balance - amount;
            System.out.println("Withdrawed Successfully");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
    
    public double balance()
    {
        return balance;
    }
}
