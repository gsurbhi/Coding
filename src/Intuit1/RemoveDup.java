package Intuit1;

public class RemoveDup {
	
	public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);
        removeDup(head);
	}

	private static void removeDup(Node list) {
		Node current = list;
		
		while(current!=null){
			Node runner = current;	
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next=runner.next.next;
				}
				else{
					runner=runner.next;
				}
			}
			current=current.next;
		}
		  while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	}

}
