package LinkedList;

public class Operation {
	 Node head;
	public  void insert(int i) {
		Node n=new Node();
		n.data=i;
		if(head==null) {
			head=n;
		}else {
			Node node=head;
			while(node.next!=null) {
				node=node.next;
			}
			node.next=n;
		}
		
	}
	
	public void show() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}

	public void insertAt(int index, int data) {
		Node n=new Node();
		n.data=data;
		Node node=head;
		for(int i=0; i<index-1; i++) {
			node=node.next;
		}
		n.next=node.next;
		node.next=n;
		
	}

	public void deleteAt(int index) {
		Node n=head;
		for(int i=0; i<index-1; i++) {
			n=n.next;
		}
		Node n1=n.next;
		n.next=n1.next;
	}
									
	public Node reverse() {		//	12->92->9->8
		Node current=head;		//	c=12 n=92 p=null
		Node prev=null;			// null<-12  ****
		Node next;				//	p=c=12  c=n=92
		while(current!=null) {
			next=current.next;
			current.next=prev;
			
			prev=current;
			current=next;
		}
		return prev;
	}
}
