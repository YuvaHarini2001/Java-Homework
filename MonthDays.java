class MonthDays
{
	public static void main(String[] args)
	{
		int Month = 2;
		switch (Month)
		{
			case 1,3,5,7,8,10,12-> System.out.println("31 days");
			case 2-> System.out.println("28 days");
			case 4,6,9,11-> System.out.println("30 days");
			default-> System.out.println("Invalid");
		}
	}
}