class ActorsArray
{
	public static void main(String[] args)
	{
		String heros[][]={{"V I J A Y"},{"A J I T H"},{"K A M A L"},{"S I M B U"}};
		
		for(int i=0;i<heros.length;i++)
		{
			for(int j=0;j<heros[i].length;j++)
			{
				System.out.print(heros[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
}