class Scholarship
{
	public static void main(String[] args)
	{
		int MARKS = 85;
		int A = 80;
		boolean B = (A<MARKS);
		boolean ATTENDANCE = true;
		boolean DISCIPLINE = true;
		boolean C = B&&ATTENDANCE;
		
		
		System.out.println("PASS & ELIGIBLE FOR SCHOLARSHIP:"+(B||C));
		
		
	}
}