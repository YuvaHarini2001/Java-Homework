class TotalBalance
{
	public static void main(String[] args)
	{
		int A = 25000;
		double B =7.0;
		int C = 4;
		int Interest = (int) (A*B*C/100);
		int totalbalance = A+Interest;
		
		System.out.println(totalbalance);
		
	}
}