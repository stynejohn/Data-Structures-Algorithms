package DoubleLinkedList;

public class DoubleLinkedList {

	private DLLNode head;
	private DLLNode tail;
	private int length;

	// create a new empty list
	public DoubleLinkedList() {
		/*
		 * head = new DLLNode(Integer.MIN_VALUE,null,null); tail = new
		 * DLLNode(Integer.MAX_VALUE,head,null); head.setNext(tail);
		 */
		length = 0;
	}

	// returning the length of the linked list
	public int length() {
		return length;
	}

	// display Double linked list
	public void display() {
		DLLNode currentNode;
		int data;
		currentNode = head;
		while (currentNode != null) {
			data = currentNode.getData();
			System.out.println(data + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	// add a node at the front of the list
	public void insertAtBegin(int data) {
		/*
		 * DLLNode newNode = new DLLNode(data,null,head);
		 * newNode.getNext().setPrev(newNode); head = newNode; length++;
		 */
		if (length <= 0) {
			DLLNode newNode = new DLLNode(data);
			newNode.setPrev(null);
			newNode.setNext(null);
			head = tail = newNode;
		} else {
			DLLNode newNode = new DLLNode(data);
			head.setPrev(newNode);
			newNode.setNext(head);
			newNode.setPrev(null);
			head = newNode;
		}

		length++;
	}

	// add a node at the end of the list
	public void insertAtTheEnd(int data) {
		if (length <= 0) {
			DLLNode newNode = new DLLNode(data);
			newNode.setPrev(null);
			newNode.setNext(null);
			head = tail = newNode;
		} else {
			DLLNode newNode = new DLLNode(data);
			tail.setNext(newNode);
			newNode.setPrev(tail);
			newNode.next = null;
			tail = newNode;
		}

		length++;
	}

	public void insertAtGivenPos(int pos, int data) {
		if (pos < 0)
			pos = 1;
		if (pos > length)
			pos = length - 1;
		DLLNode currentNode = head;
		DLLNode newNode = new DLLNode(data);
		if (pos == 1) {
			head.setPrev(newNode);
			newNode.setNext(head);
			newNode.setPrev(null);
			head = newNode;
		} else if (pos == length - 1) {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			newNode.next = null;
			tail = newNode;
		} else {
			for (int i = 1; i < pos; i++) {
				currentNode = currentNode.getNext();
			}

			newNode.setPrev(currentNode.getPrev());
			newNode.getPrev().setNext(newNode);
			newNode.setNext(currentNode);
			currentNode.setPrev(newNode);

		}

		length++;
	}

	public int returnFirstPositionOfAGivenValue(int data) {
		DLLNode currentNode = head;
		int pos = 1;
		while (currentNode != null) {
			if (currentNode.getData() == data)
				return pos;
			else {
				currentNode = currentNode.getNext();
				pos = pos + 1;
			}
		}

		return Integer.MIN_VALUE;
	}

	public void removeHead() {
		if (length > 1) {
			head.getNext().setPrev(null);
			head = head.getNext();
		} else {
			head = null;
			tail = null;
		}

		length--;
	}

	public void removeTail() {
		if (length > 1) {
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
		} else {
			head = null;
			tail = null;
		}
		length--;
	}

	public void removeValueAtGivenPos(int pos) {
		DLLNode currentNode = head;
		if (pos < 0)
			pos = 1;
		if (pos > length)
			pos = length - 1;
		if (head == null)
			return;
		else if (pos == 1) {
			head = head.getNext();
			if (head == null)
				tail = null;
		} else {
			for (int i = 1; i < pos; i++) {
				currentNode = currentNode.getNext();
			}
			if (currentNode.getNext() != null) {
				currentNode.getNext().setPrev(currentNode.getPrev());
				currentNode.getPrev().setNext(currentNode.getNext());
			} else
			{
				tail = currentNode.getPrev();
				currentNode.getPrev().setNext(null);
			}
		}

		length--;

	}
	
	public String toString()
	{
		String result = "[";
		DLLNode currentNode = head;
		if(currentNode==null)
			return result + "]";
		else
		{
			result += currentNode.getData();
			currentNode = currentNode.getNext();
			while(currentNode!=null)
			{
				result += "," + currentNode.getData();
				currentNode = currentNode.getNext();
			}
		}
		return result + "]";
	}
	
	
	
	
	
	

}
