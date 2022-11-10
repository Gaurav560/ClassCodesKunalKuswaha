package in.kk.main;

public class PeakOfTheMountainOptimisedSolution {
	//to find peak element in bitonic sequence

	public static void main(String[] args) {
		int[] arr= {22,33,44,55,60,63,66,55,50,48,45,44,33,22};
		System.out.println(binarySearch(arr));
		
	}

	 static int binarySearch(int[] arr) 
	 {
	
		int start=0;
		int end=arr.length-1;
		while (start!=end) 
		{
			int mid=(start+end)/2;
			if (arr[mid]>arr[mid+1]) 
			{
				end=mid;
				
			}
			else 
			{
				start=mid+1;
			}
			
		}return arr[start];
				
			}
			
		
	}


