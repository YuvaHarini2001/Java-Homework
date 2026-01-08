import java.util.Scanner;
class StudentList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the total number of students:");
		int student_num = sc.nextInt();
		
		String student_name[] = new String[student_num];
		
		int index = 0;
		int choice;
		
		do
		{
			System.out.print("Enter the choice:\n1.Add the student name\n2.see the student name list\n3.exit");
			System.out.println(" ");
			
			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
			
					{
						System.out.println("Enter the student name :"+(index+1));
						student_name[index] = sc1.nextLine();
						index++;
				
						System.out.println("  ");
					}
					break;
			
				case 2:
			
					for(int i =0;i<index;i++)
					{
						System.out.print(student_name[i]+"  ");
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