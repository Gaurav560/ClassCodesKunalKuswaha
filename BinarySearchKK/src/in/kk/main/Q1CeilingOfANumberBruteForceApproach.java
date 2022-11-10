package in.kk.main;

public class Q1CeilingOfANumberBruteForceApproach {

	public static void main(String[] args) {
		//brute force approach
		
		int[] arr= {11,22,33,55,66,77,88,99};
		int target=110;
		int ans=ceiling(arr,target);
		System.out.println(ans);

	}

	 static  int ceiling(int[] str, int num) {
		 for (int i = 0; i < str.length; i++) {
			 if (str[i]>=num) {
				
				 return str[i];
				
				
			}
			
		}
	return -1;
		
	}

}
