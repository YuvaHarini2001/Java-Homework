class EvenNumberDoWhileLoop
{
	public static void main(String[] args)
	{
		int i = 1;
		
		do
		{
			if(i%2==0)
			{
				System.out.println("Even Number:"+i);
			}
			
			i++;
			
		}while(i<=30);
	}
}