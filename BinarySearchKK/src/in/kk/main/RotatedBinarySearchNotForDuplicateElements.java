package in.kk.main;



public class RotatedBinarySearchNotForDuplicateElements {
	// not for duplicate elements

	public static void main(String[] args) 
	{
		int[] arr= {4,5,6,7,9,15,55,77,0,1,2,3};
		int target=6;
		System.out.println(findPivot(arr));
	System.out.println(answer(arr, target));

	}
	
	
	//this method is used for finding the pivot element
	//4 cases
	static int findPivot(int[] arr)
	{
		int start=0;
		
		int end=arr.length-1;
		
		while (start<=end)
		{
			int mid=start+(end-start)/2;
			if (mid<end && arr[mid]>arr[mid+1]) 
			{
				return mid;
				
			}
			 if (mid>start && arr[mid]<arr[mid-1]) 
			 {
				return mid-1;
				
			}
			 if (arr[start]>=arr[mid]) 
			 {
				end= mid-1;
				
			}else{
				start= mid+1;
				}
		}
		
		
			return -1;
		
	}
	
	
	//this method returns the answer
	//4 cases
	static int answer(int[]arr,int target) 
	{
		int pivot=findPivot(arr);
		//if pivot is -1 means the array is not rotated,then do normal binary search
		if (pivot==-1) {
			return binarySearch(arr, target, 0, arr.length-1);
			
		}
		//if the array is rotated
		if (arr[pivot]==target) {
			return pivot;
		}
		if (target<arr[0]) {
			return binarySearch(arr, target, pivot+1, arr.length-1);
		}
		else {
			return binarySearch(arr, target, 0, pivot);
		}
	}
	
	
	
	//this is the basic binary search algorithm used based on pivotElement 
	static int binarySearch(int[] arr,int target,int start,int end) {
	
		
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
