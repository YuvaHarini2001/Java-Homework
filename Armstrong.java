class Armstrong
{
	public static void main(String[] args)
	{
		int a = 1212;
		int b = a%10;
		int c = a/10;
		int d = c%10;
		int e = c/10;
		int f = e%10;
		int g = e/10;
		
		int h = (f*f*f*f)+(g*g*g*g)+(d*d*d*d)+(b*b*b*b);
		
		boolean i = (a==h);
		System.out.println(i);
		
	}
}