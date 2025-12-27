class RailwayTicket
{
	public static void main(String[] args)
	{
		int Seattype = 1;
		switch (Seattype)
		{
		case 1 -> System.out.println("General-Rs.250");
		case 2 ->System.out.println("Sleeper-Rs.500");
		case 3 ->System.out.println("AC 3 Tier-Rs.750");
		case 4 ->System.out.println("AC 4 Tier-Rs.1000");
		case 5 -> System.out.println("First Class-Rs.1200");
		default->System.out.println("Invalid Seattype");
		}
	}
}