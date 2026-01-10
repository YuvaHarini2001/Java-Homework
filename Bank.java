import java.util.Scanner;
class Bank
{
	double accBalance;
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		Bank bank = new Bank();
		bank.mainMenu();
	}
	
	void mainMenu()
	{
		inputBalance();
		
		int choice;
		
		do 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("********Menu********");
			System.out.println("Enter your choice:\n1.Deposit\n2.Withdrawal\n3.Display Balance\n4.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
					{
						System.out.println("Enter the deposit amount:");
						double depositAmount = sc.nextDouble();
						depositAmount(depositAmount);
						break;
					}
				
				case 2 :
					{
						System.out.println("Enter the withdrawal amount:");
						double withdrawalAmount = sc.nextDouble();
						withdrawalAmount(withdrawalAmount);
						break;
					}
				
				case 3 :
						System.out.println(accBalance);
						break;
					
				case 4 :
					{
						System.out.println("Exit");
						break;
					}
					
				default :
					{
							System.out.println("Invalid Choice");
					}
						
			}
			
		}while(choice!=4);
	}
	
	void inputBalance()
	{
		System.out.println("Enter the initial balance:");
		accBalance = sc.nextDouble();
		System.out.println("Balance added Successfully");
	}
	
	void depositAmount(double depositAmount)
	{
		accBalance=accBalance+depositAmount;
		System.out.println("Available balance after deposit:"+accBalance);
	}
	
	void withdrawalAmount(double withdrawalAmount)
	{	
		if(withdrawalAmount<=accBalance)
		{
			accBalance-=withdrawalAmount;
			System.out.println("Available balance after withdrawal:"+accBalance);
		}
		else
		{
			System.out.println("Insuffiecient Account Balance");
			System.out.println("Please enter the amount below:"+accBalance);
		}
	}
	
}