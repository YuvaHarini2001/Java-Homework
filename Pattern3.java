import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i,s,j;
		
		System.out.print("Enter the number of Rows :");
		int rows = sc.nextInt();
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (s = 1 ; s <= rows - i; s++ ) 
			{
				System.out.print(" ");	
			}
			for (j = 1 ; j <= i * 2 - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = rows - 1 ; i > 0; i-- ) 
		{
			for (s = 1 ; s<= rows - i; s++ ) 
			{
				System.out.print(" ");
			}
			for (j = 1 ; j <= i * 2 - 1; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}