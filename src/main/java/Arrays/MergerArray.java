package Arrays;

import java.util.Arrays;

public class MergerArray {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		int arr2[]= {5,6,7};
		mergeArray(arr1, arr2);
	}

	//TC = O(n)  SC=O(n)
	private static void mergeArray(int[] arr1, int[] arr2) {
		int arr[]=new int[arr1.length+arr2.length];
		int i=0;
		for(int ele:arr1) {
			arr[i++]=ele;
		}
		for(int ele:arr2) {
			arr[i++]=ele;
		}
		System.out.println(Arrays.toString(arr));
	}
}
