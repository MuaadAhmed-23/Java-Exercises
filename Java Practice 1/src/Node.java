public class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
	Node head = new Node(4);
	Node nodeB = new Node(2);
	Node nodeC = new Node(3);
	Node nodeD = new Node(10);
	
	head.next = nodeB;
	nodeB.next = nodeC;
	nodeC.next = nodeD;
	
	int i = 0;
	int countNodes(Node head) {
		if(head != null) {
			i++;
		} else {
			return 0;
		}
	}
	
}
