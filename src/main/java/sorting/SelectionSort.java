package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,2,4,7,1,10};
		for(int i=0; i<arr.length-1; i++) {
			int minIndex=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
