package DoubleLinkedList;

public class DLLNode{
	//A double linked list have a data field and two pointers, left and right
	private int data;
	DLLNode prev;
	DLLNode next;
	
	//constructors
	public DLLNode(int data)
	{
		this.data = data;
		prev = null;
		next = null;
	}
	
	public DLLNode(int data, DLLNode prev, DLLNode next)
	{
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	//set getters and setters
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}
}