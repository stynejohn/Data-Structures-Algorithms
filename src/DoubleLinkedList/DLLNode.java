package DoubleLinkedList;

//declaring a node structure
public class DLLNode {

	private int data; // value of a node
	private DLLNode prev; // pointer of a node. A left pointer and a right pointer of type DLLNode
	private DLLNode next;

	// constructor
	// whenever a new node is created this will get invoked
	public DLLNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	//getters and setters for all the variables
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
