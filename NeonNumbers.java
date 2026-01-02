class NeonNumbers
{
	public static void main(String[] args)
	{
		int a = 9;
		int temp = a*a;
		int rem = 0;
		int sum = 0;
	
		while(temp>0)
		{
			rem = temp%10;
			sum = sum+rem;
			temp = temp/10;
		}
	
		if(a==sum)
		{
			System.out.println("Neon Number:"+a);
		}
		else
		{
			System.out.println("Not a Neon Number:"+a);
		}
	}
}