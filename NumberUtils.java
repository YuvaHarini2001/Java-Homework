
package numbers;


public class NumberUtils 
{
    public long factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        
        long result = 1;
        
        for (int i = 1; i <=n; i++)
        {
            result = result*i;
        }
        
        return result;
    }
    
    public boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        
        for (int i = 2; i <=n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        
        return true;
    }
}
