package NthNodeFromEnd;

public class LinkedList {

	private int length;

	// A single node of a list
	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
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

	public ListNode NthNodeFromEnd(int nthNode) {

		ListNode node = null;
		int remainingNode = 1;
		for (ListNode currentNode = head; currentNode != null; currentNode = currentNode.next) {

			remainingNode = 0;

			for (ListNode next = currentNode.next; next != null; next = next.next)
				remainingNode++;

			if (remainingNode < nthNode - 1) {

				System.out.println("Operation can't be performed, since there is fewer nodes");
				break;
			}

			else if (remainingNode == nthNode - 1) {
				node = currentNode;
				break;
			}

			else
				continue;

		}

		return node;
	}

}
