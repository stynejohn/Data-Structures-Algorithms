package singleLinkedList;

public class ListNode {
	
	private int data;
	ListNode next;
	
	public ListNode(int data)
	
	{
		this.data = data;
		this.next = null;
		
	}

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}
