package in.kk.main;

public class BinarySearchAscendingOrder {

	public static void main(String[] args) {
		
		int[] array = {-44,0,55,-66,77,33,88,99,101};
		int target=-44;
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
				start=middle+1;
			}
			else {
				end=middle-1;
			} 
			
			
		}//in case the element does not exists
		return -1;
	}
}
