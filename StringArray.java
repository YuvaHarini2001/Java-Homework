class StringArray
{
	public static void main(String[] args)
	{
		String cities[][]={{"Chennai","Madurai","Trichy"},{"Bengaluru","Mysuru","Mangaluru"},{"Trivandrum","Kochi","Kozhikode"},{"Visak","Tirupati","Vijayawada"}};
		
		for(int i=0;i<cities.length;i++)
		{
			for(int j=0;j<cities[i].length;j++)
			{
				System.out.print(cities[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
}