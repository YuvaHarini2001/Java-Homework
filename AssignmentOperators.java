class AssisgnmentOperators
{
	public static void main(String[] args)
	{
		int NUM = 10;
		int A = (NUM += 5);
		int B = (NUM -= 3);
		int C = (NUM *= 2);
		int D = (NUM /= 4);
		
		System.out.println("ORINGINAL:"+NUM);
		System.out.println("AFTER += 5:"+A);
		System.out.println("AFTER -=3:"+B);
		System.out.println("AFTER *= 2:"+C);
		System.out.println("AFTER /= 4:"+D);
		
		
	}
}