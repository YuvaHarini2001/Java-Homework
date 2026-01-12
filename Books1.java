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
			System.out.print("Enter the choice:\n1.Add Books Name\n2.See the list of books with their id\n3.Search the book by Id\n4.Exit");
			System.out.println(" ");
			
			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
				
					if(index<book_name.length)
					{
						System.out.println("Enter the book_name:"+(index+1));
						book_name[index] = sc1.nextLine();
						System.out.println("Enter the book_id:"+(index+1));
						book_id[index] =sc.nextInt();
						index++;
				
						System.out.println("  ");
					}
					else
					{
						System.out.println("Book Name is Full");
					}
					break;
				
				case 2:
			
					for(int i =0;i<index;i++)
					{
						System.out.println(book_id[i]+ " - " + book_name[i]);
					}
					break;
				
				case 3:
					{
						System.out.println("enter the Search ID:");
						int searchId = sc.nextInt();
						
						for(int i = 0; i<book_id.length;i++)
						{
							if(searchId==book_id[i])
							{
								System.out.println("Book Found:"+"  "+book_name[i]);
							}
							else
							{
								System.out.println("Book not Found");
							}
						}
					}
					break;
				case 4:
					
					System.out.println("Exit");
					break;
				
				default:
			
					System.out.println("Invalid Choice");
					break;
			}
				
		}while(choice!=3);
	}
}