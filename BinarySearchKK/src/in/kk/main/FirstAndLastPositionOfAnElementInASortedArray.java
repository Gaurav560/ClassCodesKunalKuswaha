package in.kk.main;

import java.util.Arrays;

public class FirstAndLastPositionOfAnElementInASortedArray {

	public static void main(String[] args) 
	{
		int []arr={11,55,44,44,55,66,77,88};
		int target=55;
System.out.println(Arrays.toString(searchRange(arr, target)));
	}
	static int[] searchRange(int[]arr,int target)
	{
		int[]ans= {-1,-1};
		int start=search(arr, target, true);
		int end=search(arr, target, false);
		ans[0]=start;
		ans[1]=end;  
		return ans;
	}
	static int search(int[]arr,int target,boolean findStartIndex) 
	{
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while (start<=end)
		{
			
			//find the middle index
			int middle=start+(end-start)/2;//might be possible that start + end might be able to exceed the range of integer that creates some error
			if (target==arr[middle]) 
			{
				//potential answer found
				ans=middle;
				if (findStartIndex) 
				{
					end=middle-1;
				}
				else 
				{
					start=middle+1;
				}
				
			}
			else if (target>arr[middle]) 
			{
				start=middle+1;
			}
			else 
			{
				end=middle-1;
			} 
			
			
		}
		return ans;
	}

}
