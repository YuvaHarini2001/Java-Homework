import java.util.Scanner;
class LinearSearch
{    
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter the index value"+(i+1)+":");
			arr[i] = sc.nextInt();
		}
        System.out.println("Enter the search value:");
        int serachValue =sc.nextInt();
        
        LinearSearch ls = new LinearSearch();
        int index = ls.linearSearch(arr, serachValue);
        System.out.println("Index:"+index);
    }
    
    public int linearSearch(int[] arr, int searchvalue)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == searchvalue)
            {
                return i;
            }
        }
        return -1;
    }
}