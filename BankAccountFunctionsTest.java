
package bankaccountoperations;

import org.junit.Assert;
import org.junit.Test;


public class BankAccountFunctionsTest 
{
    @Test
    public void testBalance()
    {
        BankAccountFunctions ba = new BankAccountFunctions(1000.0);
        Assert.assertEquals(1000.0,ba.balance(), 0.01);
    }
    
    @Test
    public void testDeposit()
    {
        BankAccountFunctions ba = new BankAccountFunctions(1000.0);
        double res = ba.deposit(500.0);
        Assert.assertEquals(1500.0,res, 0.01);
    }
    
    @Test
    public void testWithdraw()
    {
        BankAccountFunctions ba = new BankAccountFunctions(1500.0);
        double res = ba.withdraw(300.0);
        Assert.assertEquals(1200.0,res, 0.01);
    }
    
    @Test
    public void balanceTest()
    {
        BankAccountFunctions ba = new BankAccountFunctions(1200.0);
        Assert.assertEquals(1200.0,ba.balance(), 0.01);
    }
   
}
