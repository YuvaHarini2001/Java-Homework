class Books
{
	public static void main(String[] args)
	{
		int totalbooks= 1800;
		double A = 40.0;
		double B = 20.0;
		double C = 30.0;
		double D = 10.0;
		int mathsbooks= (int)((A/100)*totalbooks);
		int englishbooks = (int) ((B/100)*totalbooks);
		int sciencebooks = (int) ((C/100)*totalbooks);
		int socialbooks = (int) ((D/100)*totalbooks);
		
		
		System.out.println(mathsbooks);
		System.out.println(englishbooks);
		System.out.println(sciencebooks);
		System.out.println(socialbooks);
		
		
	}
}