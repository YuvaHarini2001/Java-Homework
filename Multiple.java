import java.util.Scanner;
class Multiple
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if(number%3==0&&number%7==0)
		{
			System.out.println("Multiple of 3 and 7");
		}
		else if(number%3==0)
		{
			System.out.println("Multiple of 3");
		}
		else if(number%7==0)
		{
			System.out.println("Multiple of 7");
		}
		else 
		{
			System.out.println("Not a Multiple of 3 and 7");
		}
	}
}