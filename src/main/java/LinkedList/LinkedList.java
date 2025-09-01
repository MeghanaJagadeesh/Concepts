package LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		Operation operation=new Operation();
		operation.insert(12);
		operation.insert(92);
		operation.insert(72);
		operation.insert(8);
		
		
		operation.insertAt(2,9);
		System.out.println("Before delete");
		operation.show();
		operation.deleteAt(3);
		System.out.println("after delete");
		operation.show();
		
		Node head = operation.reverse();
		System.out.println("after reverse");
		printList(head);
	}
	static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
	
	
}
