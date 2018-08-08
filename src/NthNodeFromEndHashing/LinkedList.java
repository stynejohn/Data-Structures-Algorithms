package NthNodeFromEndHashing;

import java.util.Hashtable;

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

	public ListNode NthNodeFromEndHashing(int nthNode) {

		Hashtable<Integer,ListNode> listTable = new Hashtable<Integer, ListNode>();
		
		int length = 0;
		int i = 0;
	    ListNode currentNode = head;
		while(currentNode!=null)
		{
			i++;
			listTable.put(i, currentNode);
			length++;
			currentNode = currentNode.next;
		}
		
		int indexNode = length-nthNode+1;
		System.out.println("index of the table where node exists is::"+indexNode);
		ListNode node = listTable.get(indexNode);
		return node; 
	}

}

