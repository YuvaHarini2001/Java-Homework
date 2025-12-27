class Grade
{
	public static void main(String[] args)
	{
		char grade = 'E';
		switch (grade)
		{
			case 'A'-> System.out.println("Very Good");
			case 'B'-> System.out.println("Good");
			case 'C'-> System.out.println("Average");
			case 'D'-> System.out.println("Very Poor");
			case 'F'-> System.out.println("poor");
			default-> System.out.println("Fail");
		}
	}
}