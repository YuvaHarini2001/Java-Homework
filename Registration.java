import java.util.Scanner;
class Registration
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the number of registartion:");
		int register_num = sc.nextInt();
		
		String user_name[] = new String[register_num];
		String password[] = new String [register_num];
		
		int index = 0;
		int choice;
		
		do
		{
			System.out.print("Enter the choice:\n1.Registration\n2.Login\n3.exit");
			System.out.println(" ");
			
			choice = sc.nextInt();
		
			switch(choice)
			{
				case 1:
				
					if(index<user_name.length)
			
					{
						System.out.println("Enter the username :"+(index+1));
						System.out.println("Enter the password:"+(index+1));
						user_name[index] = sc1.nextLine();
						password[index] =sc1.nextLine();
						index++;
				
						System.out.println("  ");
					}
					else
					{
						System.out.println("Username is full");
					}
					break;
				case 2:
						String username;
						String pass;
					
					for(int i =0;i<index;i++)
					{
						username=user_name[i];
						pass=password[i];
						
						
						if(user_name[i].equals(username))
						{
							if((user_name[i].equals(username))&&(password[i].equals(pass)))
							{
								System.out.println("User Name:"+username+"  ");
								System.out.println("Password:"+pass+"  ");
							}
							else
							{
								System.out.println("Invalid password");						    
							}
						}
						else
						{
							System.out.println("Invalid Username");
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