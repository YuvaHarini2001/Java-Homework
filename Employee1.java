import java.util.Scanner;
class Employee1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the total number of employees:");
		int employee_num = sc.nextInt();
		
		String employee_name[] = new String[employee_num];
		
		int index = 0;
		int choice;
		
		do
		{
			System.out.print("Enter the choice:\n1.Add the employee name\n2.see the employee name list\n3.exit");
			System.out.println(" ");
			
			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
					
					if(index<employee_name.length)
					{
						System.out.println("Enter the employee name :"+(index+1));
						employee_name[index] = sc1.nextLine();
						index++;
				
						System.out.println("  ");
					}
					else
					{
						System.out.println("Employee name is full");
					}
					break;
			
				case 2:
					
					for(int i =0;i<index;i++)
						{
							System.out.print(employee_name[i]+"  ");
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