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
				
					int Id;
					String bookname;
			
					for(int i =0;i<index;i++)
					{
						Id = book_id[i];
						bookname = book_name[i];
						
						if(book_id[i]==(Id))
						{
							if((book_id[i]==(Id))&&(book_name[i].equals(bookname)))
							{
								System.out.println("Book Id:"+Id);
								System.out.println("Book Name:"+bookname);
							}
							else
							{
								System.out.println("Invalid book name");
							}
						}
						else
						{
							System.out.println("Invalid book Id");
						}
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