
package numbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NumberUtilsTest 
{
    @BeforeClass
    public static void beforeAll()
    {
        System.out.println("***Factorila and Prime Number Program Starts***");
    }
    
    @Before
    public void beforeEach()
    {
        System.out.println("Testing Starts");
    }
    
    @Test
    public void testFactorial()
    {
        NumberUtils nu = new NumberUtils();
        long res = nu.factorial(5);
        Assert.assertEquals(120, res);
        long res1 = nu.factorial(8);
        Assert.assertEquals(40320, res1);
        System.out.println("Factorial Testing Completed");
    }
    
    @Test
    public void testPrime()
    {
        NumberUtils nu = new NumberUtils();
        boolean res = nu.isPrime(5);
        Assert.assertEquals(true, res);
        boolean res1 = nu.isPrime(8);
        Assert.assertEquals(false, res1);
        System.out.println("Prime Number Testing Completed");
    }
    
    @After
    public void afterEach()
    {
        System.out.println("Testing Ends");
    }
    
    @AfterClass
    public static void afterAll()
    {
        System.out.println("***Factorial and Prime Number Program Ends***");
    }
}
