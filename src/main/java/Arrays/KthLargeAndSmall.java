package Arrays;

import java.util.PriorityQueue;

/*
 * Find the Kth Smallest/Largest Element in an Array
Example: Input: [7, 5, 3, 1, 9], k=3 → Output: 5
 */
public class KthLargeAndSmall {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 3, 1, 9 };
		int k = 2;
		kthLargeSmall(arr, k);
	}

	// we have used the priority queue here coz it is efficient way to keep the track of kth ;argest element 
	// and easy to delete and add
	
	//TC= O(n log n) SC=O(n);
	private static void kthLargeSmall(int[] arr, int k) {
		PriorityQueue<Integer> heap=new PriorityQueue<Integer>();
		for(int ele:arr) {
			heap.add(ele);
			if(heap.size()>k) {
				heap.poll();
			}
		}
		System.out.println(heap.peek());
	}
	
	//explanation
	/*
	 * 7 - [7]
	 * 5 - [5]
	 * 3-[3,5,7] size 3>2 - remove 3 - current heap [5,7]
	 * 1-[1,5,7] size 3>2 - remove 1 - current heap [5,7] 
	 * 9-[5,7,9] size 3>2 - remove 5 - current heap [7,9]
	 *  heap.peek() - 7
	 */
}
