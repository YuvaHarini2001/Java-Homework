import java.util.Scanner;
class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units:");
		int a= sc.nextInt();
		int unit1 = a*5;
		int unit2 = (100*5)+((a-100)*7);
		int unit3= ((100*5)+(100*7)+((a-200)*10));
		
		if(a<=100)
		{
			System.out.println("Electricity Bill Rs:"+unit1);
		}
		else if((a>=101)&&(a<=200))
		{
			System.out.println("Electricity Bill Rs:"+unit2);
		}
		else 
		{
			System.out.println("Electricity Bill Rs:"+unit3);
		}
	}
}