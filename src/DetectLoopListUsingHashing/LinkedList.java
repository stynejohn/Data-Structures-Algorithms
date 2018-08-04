package DetectLoopListUsingHashing;

import java.util.HashSet;

public class LinkedList {
	
	private int length;
	
	//A single node of a list
	static class ListNode
	{
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	//head will always point to the top of the list
	ListNode head;
	
	//inserting new node at the front of the list
	public void push(int data)
	{
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
		setLength(getLength() + 1);
	}
	
	public void display()
	{
		ListNode currentNode = head;
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+"  ");
			currentNode = currentNode.next;
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	//using hashing
	public boolean detectCycle(ListNode currentNode)
	{
		HashSet<ListNode> hs = new HashSet<ListNode>();
		
		while(currentNode!=null)
		{
			if(hs.contains(currentNode))
				return true;
			hs.add(currentNode);
			currentNode = currentNode.next;
			
		}
		
		return false;
	}
	
}























