import java.util.Scanner;
class Reverse
{
	Scanner sc=new Scanner(System.in);
	int numbers[]=new int[10];
	
		void enterNumbers()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Enter the numbers:"+(i+1));
				numbers[i]=sc.nextInt();
			}
		}
		void displayNumbers()
		{
			for(int i=0;i<10;i++)
			{
			System.out.print(numbers[i]+" ");
			}
			
		}
		void displayNumbersReverse()
		{
			for(int i=9;i>=0;i--)
			{
				System.out.print(numbers[i]+" ");
			}
		}
		
		void mainMenu()
		{
			Scanner sc = new Scanner(System.in);
			int choice;
		
			do
			{
				System.out.println("**********Menu*******");
				System.out.print("Enter your choice:\n1.Enter the numbers\n2.Display Numbers\n3.Display Numbers in Reverse Order\n4.Exit");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
						enterNumbers();
						break;
						
					case 2:
						displayNumbers();
						break;
						
					case 3:
						displayNumbersReverse();
						break;
						
					case 4:
						System.out.println("Exit");
						break;
						
					default:
						System.out.println("invalid choice");
						break;
					
				}
			}while(choice!=4);
		}
		
		public static void main(String[] args)
		{
			Reverse rev =new Reverse();
			rev.mainMenu();	
		}
}