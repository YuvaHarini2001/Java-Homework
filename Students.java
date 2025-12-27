class Students
{
	public static void main(String[] args)
	{
		int A = 50;
		double B = 40.0;
		int numberofgirls = (int)((B/100)*A);
		int numberofboys = A - numberofgirls;
		
		System.out.println(numberofgirls);
		System.out.println(numberofboys);
		
	}
}