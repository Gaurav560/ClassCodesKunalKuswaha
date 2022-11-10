package in.kk.main;

public class FindTheIndexOfArrayOfAnElementInInfiniteArray {
	//finding index of an element of in infinite search.

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,3,1};
int target=3;
System.out.println(answer(arr, target));
	}
static int answer(int[] arr,int target) {
	int start=0;
	int end=1;//starting by first minimum box
	while (target>arr[end]) 
	{
		
		int temp=end+1;
		end=end+((end-start)+1)*2;
		start=temp;
		
		
	}return binarySearch(arr, target, start, end);
	
	
	
}
	 static int binarySearch(int[] arr, int target,int start,int end)
	 {
		
			
			while (start<=end)
			{
				
				//find the middle index
				int middle=start+(end-start)/2;//might be possible that start + end might be able to exceed the range of integer that creates some error
				if (target==arr[middle]) 
				{
					//ans found
					return middle;
					
				}
				else if (target>arr[middle]) 
				{
					start=middle+1;
				}
				else {
					end=middle-1;
				} 
				
				
			}//in case the element does not exists
			return -1;
		
	}

}
