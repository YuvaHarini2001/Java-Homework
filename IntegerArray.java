class IntegerArray
{
	public static void main(String[] args)
	{
		int marks[][]={{85,78,90},{88,92,80},{70,75,68}};
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
}