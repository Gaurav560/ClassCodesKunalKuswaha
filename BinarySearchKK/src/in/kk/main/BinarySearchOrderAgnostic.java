package in.kk.main;

public class BinarySearchOrderAgnostic {

	public static void main(String[] args) {
		//order agnostic means array is sorted but we don't know whether it is in ascending or descending order.

		int[] array = {22,33,44,55,66,77,88,99};
		int target=3;
		int ans=orderAgnosticBinarySearch(array, target);
		System.out.println("and the index of target value is :"+ans);
	}

	 static int orderAgnosticBinarySearch(int[] array, int target) 
	 {
		 if (array[0]>array[array.length-1])
		 {
			 System.out.println("the array is sorted in descending order.");
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
		 
		 
		 
		 if (array[0]<array[array.length-1]) 
		 {
			 System.out.println("the array is sorted in ascending order.");
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
		 //in case all the elements of an array is same
		return 0;
		 
	}
	}


