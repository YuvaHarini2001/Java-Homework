class ArmstrongNumbers
{
	public static void main(String[] args)
	{
		int a = 121;
		int temp = a;
		int rem = 0;
		int sum = 0;
	
		while(temp>0)
		{
			rem = temp%10;
			sum = sum+(rem*rem*rem);
			temp = temp/10;
		}
	
		if(a==sum)
		{
			System.out.println("Armstrong Number:"+a);
		}
		else
		{
			System.out.println("Not a Armstrong Number:"+a);
		}
	}
}