package Searching;

public class LinearSerach {
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,6,7,9,10,13,45};
		int target=10;
		int result=linerSearcg(arr,target);
		if(result!=-1) {
			System.out.println("Element found at : "+result);
		}else {
			System.out.println("elements not found");
		}
	}

	private static int linerSearcg(int[] arr, int target) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target)
				return i;
		}
		return -1;
	}

}
