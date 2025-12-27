class Future
{
	public static void main(String[] args)
	{
		int A = 50000;
		double B = 6.0;
		int C = 5;
		int Interest = (int) (A*B*C/100);
		int totalbalance = A+Interest;
		
		System.out.println(Interest);
		System.out.println(totalbalance);
		
	}
}