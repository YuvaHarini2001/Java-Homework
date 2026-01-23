import java.util.Scanner;
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total length:");
		int length = sc.nextInt();
		int arr[] = new int[length];
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter the values of index"+(i+1)+":");
			arr[i]= sc.nextInt();
		}
		int passes = 0;
		
		BubbleSort bs = new BubbleSort();
		bs.mainMenu(i,arr,passes);
	}
	
	void mainMenu(int i,int arr[],int passes)
	{
		for(i =0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			passes++;
		}
		
		System.out.println("Sorted Array:");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("  ");
		
		System.out.println("Passes:"+passes);
	}
}
	
		