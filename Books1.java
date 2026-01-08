import java.util.Scanner;
class Books1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of Books:");
		int books = sc.nextInt();
		
		String book_name[] = new String[books];
		int book_id[] = new int [books];
		
		int index = 0;
		int choice;
		
		do
		{
			System.out.print("Enter the choice:\n1.Add Books Name\n2.See the list of books with their id\n3.exit");
			System.out.println(" ");
			
			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
			
					{
						System.out.println("Enter the book_name:"+(index+1));
						book_name[index] = sc1.nextLine();
						System.out.println("Enter the book_id:"+(index+1));
						book_id[index] =sc.nextInt();
						index++;
				
						System.out.println("  ");
					}
					break;
				
				case 2:
			
					for(int i =0;i<index;i++)
					{
						System.out.println("**************************");
						System.out.println("Book Id:"+book_id[i]+"  ");
						System.out.println("Book Name:"+book_name[i]+"  ");
					}
					break;
				
				case 3:
			
					System.out.println("Exit");
					break;
				
				default:
			
					System.out.println("Invalid Choice");
					break;
			}
				
		}while(choice!=3);
	}
}