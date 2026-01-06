import java.util.Scanner;
class CharArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows ::");
		int rows = sc.nextInt();
		System.out.println("Enter the Coloumns ::");
		int coloumns = sc.nextInt();
		
		int count[][]=new int[rows][coloumns];
		
		for(int i =0;i<count.length;i++)
		{
			for(int j=0;j<count[i].length;j++)
			{
				System.out.println("Enter the"+i+","+j+"index value");
				count[i][j]=sc.next().charAt(0);
			}
			System.out.println(" ");
		}
		System.out.println("************************");
		
		
		for(int i =0;i<count.length;i++)
		{
			for(int j =0;j<count[i].length;j++)
			{
				System.out.print((char)count[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}