package NthNodeFromEndRecursion;

public class LinkedList {

	private int length;
	static int counter;
	// A single node of a list
	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public ListNode() {
			// TODO Auto-generated constructor stub
		}
	}

	// head will always point to the top of the list
	ListNode head;

	// inserting new node at the front of the list
	public void push(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
		setLength(getLength() + 1);
	}

	public void display() {
		ListNode currentNode = head;

		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.print("null");

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void NthNodeFromEnd(int data)
	{
		NthNodeFromEndRecursion(head,data);
	}

	public void NthNodeFromEndRecursion(ListNode head, int NthNode) {
		
		if(head == null)
			return;
		NthNodeFromEndRecursion(head.next, NthNode);
		counter++;
		if(counter==NthNode)
			System.out.println("Nth node from end is :: "+head.data);
		
	}

}



