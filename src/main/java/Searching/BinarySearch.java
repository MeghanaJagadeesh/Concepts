package Searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {1,3,4,5,8,9,10,14,17,20,75};
		int target=17;
		int result=binarySearch(arr, target);
		if(result!=-1)
			System.out.println("Elements found at : "+result);
		else
			System.out.println("elements not found");
	}

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;
	}
}
