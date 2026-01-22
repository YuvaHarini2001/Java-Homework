class BinarySearch2 
{    
    public static void main(String[] args)
    {
		int[] arr = {10,20,30,40,50};
        int searchvalue = 30;
        
        BinarySearch2 obj = new BinarySearch2();
        int index = obj.binarySearch(arr, searchvalue);
        System.out.println("Index:"+index);
    }
    
    int binarySearch(int[] arr, int searchvalue)
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