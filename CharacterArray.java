class CharacterArray
{
	public static void main(String[] args)
	{
		char letters[][]={{'a','b','c','d','e'},{'f','g','h','i','j'},{'k','l','m','n','o'},{'p','q','r','s','t'}};
		
		for(int i=0;i<letters.length;i++)
		{
			for(int j=0;j<letters[i].length;j++)
			{
				System.out.print(letters[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
}