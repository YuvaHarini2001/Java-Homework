import java.util.Scanner;
class ReverseArray
{
	Scanner sc = new Scanner(System.in);
	int index = 0;
	
	int[] enterNumbers(int num[])
	{
		if(index<num.length)
		{
			System.out.println("Enter the Numbers:"+(index+1));
			num[index] = sc.nextInt();
			index++;
		}
		else 
		{
			System.out.println("No Space Numbers are Filled");
		}
		return num;
	}
	
	void displayNumbers(int num[])
	{
		for(int i =0;i<num.length;i++)
		{
			System.out.println("Display Numbers:"+(i+1)+"-"+num[i]);
		}
	}
	
	void reverseOrder(int num[])
	{
		for(int i =num.length-1;(i<num.length)&&(i>=0);i--)
		{
			System.out.println("Reversed Numbers:"+(i+1)+"-"+num[i]);
		}
	}
	
	void mainMenu()
	{
		int choice;
		System.out.println("Enter the Total length of Numbers:");
		int length = sc.nextInt();
		int numbers[] = new int[length];
		
		do
		{
			System.out.println("*******Menu*******");
			System.out.println("Enter your choice:\n1.Enter the Numbers\n2.Display Numbers\n3.Reverse the order of Numbers\n4.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					numbers = enterNumbers(numbers);
					break;
					
				case 2:
					displayNumbers(numbers);
					break;
					
				case 3:
					reverseOrder(numbers);
					break;
					
				case 4:
					System.out.println("Exit");
					break;
					
				default :
					System.out.println("Invalid Choice");
					break;
			}
		}while(choice!=4);
	}
	
	public static void main(String[] args)
	{
		ReverseArray rev = new ReverseArray();
		rev.mainMenu();
	}
}