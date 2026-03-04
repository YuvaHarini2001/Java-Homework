
package numbers;

import java.util.Scanner;


public class NumbersMain {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        NumberUtils nu = new NumberUtils();
        
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        System.out.println("Factorila Number:"+nu.factorial(num));
        System.out.println("Prime Number:"+nu.isPrime(num));
    }
    
}
