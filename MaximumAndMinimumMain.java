
package maximumandminimum;

import java.util.Scanner;


public class MaximumAndMinimumMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayUtils au = new ArrayUtils();
        
        System.out.println("Enter the length:");
        int length = sc.nextInt();
        
        int arr[] = new int[length];
        
        for (int i = 0; i <arr.length; i++)
        {
            System.out.println("Enter the "+(i+1)+"st element:");
            arr[i]= sc.nextInt();
        }
        
        System.out.println("Maximum:"+au.findMax(arr));
        System.out.println("Minimum:"+au.findMin(arr));
    }
    
}
