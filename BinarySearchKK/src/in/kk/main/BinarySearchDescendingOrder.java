package in.kk.main;

public class BinarySearchDescendingOrder {

	public static void main(String[] args) {
		
		int[] array = {100,99,88,77,66,55,44,33,22,11,0,-11};
		int target=0;
		int ans=binarySearch(array, target);
		System.out.println(ans);
	}
	//return the index
	//return -1 if it does not return the index
	static int binarySearch(int[] array,int target) {
		int start=0;
		int end=array.length-1;
		
		while (start<=end)
		{
			
			//find the middle index
			int middle=start+(end-start)/2;//might be possible that start + end might be able to exceed the range of integer that creates some error
			if (target==array[middle]) 
			{
				//ans found
				return middle;
				
			}
			else if (target>array[middle]) 
			{
				end=middle-1;
			}
			else {
				start=middle+1;
			} 
			
			
		}//in case the element does not exists
		return -1;
	}
}
