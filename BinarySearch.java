import java.util.Scanner;
class BinarySearch
{ 
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your length:");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter your index value"+(i+1)+":");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter your searchvalue:");
		int searchvalue = sc.nextInt();
		
        BinarySearch obj = new BinarySearch();
        int index = obj.binarySearch(arr,searchvalue);
        System.out.println("Index:"+index);
    }
    
    int binarySearch(int[] arr,int searchvalue)
    {
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
        
        while(left <= right)
        {
            if(searchvalue == arr[mid])
            {
                return mid;
            } else if(searchvalue > arr[mid])
            {
                left = mid+1;
            } else if(searchvalue < arr[mid])
            {
                right = mid-1;
            }
            mid = (left + right)/2;
        }
        return -1;
    }
}