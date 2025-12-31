import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = sc.nextInt();
	    
		if(number<=1)
		{
			System.out.println("Not a prime number:"+number);
		}
		else if((number==2)||(number==3)||(number==5)||(number==7))
		{
			System.out.println("prime number:"+number);
		}
		else if((number%2==0)||(number%3==0)||(number%5==0)||(number%7==0))
		{
			System.out.println("Not a prime number:"+number);
		}
		else
		{
			System.out.println("prime number:"+number);
		}
	}
}