class Pattern1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j<=1)
				{
					System.out.print("1");
				}
				else if(j<=2)
				{
					System.out.print("2");
				}
				else if(j<=3)
				{
					System.out.print("3");
				}
				else if(j<=4)
				{
					System.out.print("4");
				}
				else if(j<=5)
				{
					System.out.print("5");
				}
			}
			System.out.println(" ");
		}
	}
}