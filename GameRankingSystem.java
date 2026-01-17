import java.util.Scanner;
class GameRankingSystem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("****Wrong Casting Version****");
		System.out.println("Enter the Score (long):");
		long score = sc.nextLong();
		System.out.println("Enter the time Taken (double):");
		double time = sc.nextDouble();
		long wrongRank = (long)(score)/(long)(time);
		System.out.println("Wrong Rank :"+wrongRank);
		System.out.println("*****Correct casting version*****");
		int correctRank = (int)(score/time);
		System.out.println("Correct Rank :"+correctRank);
	}
}