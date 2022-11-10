package in.kk.main;

public class CeilingOfANumberBinarySearchApproach {

	public static void main(String[] args) {
		int[] arr= {11,22,33,55,66,77,88,99};
		int target=45;
		
		int ans=ceiling(arr,target);
		System.out.println(ans);

	}
          static int ceiling(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		int mid=0;
		if (target<=99) {
			
		
		while (start<=end) {
			mid=(start+end)/2;
			if (target==arr[mid]) 
			{
				return arr[mid];
			}
			else if (target>arr[mid]) {
				start=mid+1;
				
			}
			else {
				end=mid-1;
			}
		}
		return arr[start];
		}
		else {
			return -1;
		}
	}

}
