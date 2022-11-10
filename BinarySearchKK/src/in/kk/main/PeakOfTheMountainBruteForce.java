package in.kk.main;

import java.util.Arrays;

public class PeakOfTheMountainBruteForce {

	public static void main(String[] args) {
		//brute-force approach
		int[] arr= {22,33,44,55,66,55,44,33,22};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
		

	}

	 static void bubbleSort(int[] arr)
	 {
		 int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		
	}

}
