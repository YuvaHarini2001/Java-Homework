
package happynumber;

import java.util.Scanner;


public class HappyNumberMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int res = num;
        
        while(res!=1&&res!=4)
        {
            res = isHappy(res);
        }
        
        if(res==1)
        {
            System.out.println(num+" is a Happy Number");
        }
        else
        {
            System.out.println(num+" is not a Happy Number");
        }
    }
    
    public static int isHappy(int res)
    {
       int sum = 0;
       
       while(res>0)
       {
           int digit = res%10;
           sum = sum + (digit*digit);
           res = res/10;
       }
       return sum;
    }
    
}
