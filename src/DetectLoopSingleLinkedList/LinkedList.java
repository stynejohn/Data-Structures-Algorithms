package DetectLoopSingleLinkedList;


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
	
	
	public boolean detectCycle(ListNode head)
	{
		ListNode a = head,b = head;
		
		while(a!=null && b!=null && b.next!=null)
		{
			a = a.next;
			b = b.next.next;
			if(a==b)
				return true;
			
		}
		
		return false;
	}
	
}























