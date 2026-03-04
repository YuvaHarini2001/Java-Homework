
package maximumandminimum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArrayUtilsTest 
{
    @BeforeClass
    public static void beforeAll()
    {
        System.out.println("***Maximum and Minimum Program Starts***");
    }
    
    @Before
    public void beforeEach()
    {
        System.out.println("Testing Starts");
    }
    
    @Test
    public void testFindMax()
    {
        ArrayUtils au = new ArrayUtils();
        int arr[] = {12,5,8,20,3};
        int res = au.findMax(arr);
        Assert.assertEquals(20, res);
        System.out.println("Maximum Number Testing Completed");
    }
    
    @Test
    public void testFindMin()
    {
        ArrayUtils au = new ArrayUtils();
        int arr[] = {12,5,8,20,3};
        int res = au.findMin(arr);
        Assert.assertEquals(3, res);
        System.out.println("Minimum Number Testing Completed");
    }
    
    @After
    public void afterEach()
    {
        System.out.println("Testing Ends");
    }
    
    @AfterClass
    public static void afterAll()
    {
        System.out.println("***Maximum and Minimum Program Ends***");
    }
}
