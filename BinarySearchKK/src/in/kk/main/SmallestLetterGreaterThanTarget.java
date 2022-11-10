package in.kk.main;

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args)
	{
		char[] arr= {'c','d','e','f','g','o'};
		char target='z';
		
		char ans=smallestLetter(arr,target);
		System.out.println(ans);

	}
          static char smallestLetter(char[] arr, Character target) {
		int start=0;
		int end=arr.length-1;
		int mid=0;
		if (target<=arr[arr.length-1]) {
			
		
		while (start<=end) {
			mid=(start+end)/2;
			
			 if (target>arr[mid]) {
				start=mid+1;
				
			}
			else {
				end=mid-1;
			}
		}
		return arr[start+1];
		}
		else {
			return arr[0];
		}
	}

}


	


