package singleLinkedList;

public class LinkedList {
	
	int length;
	
	public LinkedList()
	{
		length = 0;
	}
	
	ListNode head;
	
	public  ListNode getHead()
	{
		return head;
	}
	
	public  void insertAtBegin(ListNode node)
	{
		node.setNext(head);
		head = node;
		length++;
	}
	
	public  void insertAtEnd(ListNode node)
	{
		if(head == null)
		{
			head = node;
		}
		
		else
		{
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			p.setNext(node);
		}
		length ++;
	}
	
	public  void insert(int pos, int data)
	{
		if(pos<0)
			pos = 0;
		if(pos>length)
			pos = length;
		if(head == null)
		{
			ListNode node = new ListNode(data);
			head = node;
		}
		else if(pos==0)
		{
			ListNode node = new ListNode(data);
			node.next = head;
			head = node;
			
		}
		else
		{
			ListNode temp = head;
			for(int i = 1; i<pos; i++)
			{
				temp = temp.getNext();
			}
			
			ListNode newNode = new ListNode(data);
			newNode.next = temp.next;
			temp.setNext(newNode);
			
		}
		
		length ++;
	}
	
	public  void removeFromBegin()
	{
		ListNode node = head;
		if(node!=null)
		{
			head = node.getNext();
			node.setNext(null);
			length--;
		}
		
	}
	
	public  void removeFromEnd()
	{
		ListNode node = head;
		if(node!=null)
		{
			ListNode p = head, q = null, next = head.getNext();
			if(next==null)
			{
				head = null;
				length--;
			}
			else
			{
			while((next = p.getNext())!=null)
			{
				q = p;
				p = next;
			}
			q.setNext(null);
			length--;
			}
			
		}
		
	}
	
	public  void removeData(int data)
	{
		if(head!=null)
		{
			if(head.getData() == data)
				head = head.getNext();
			else
			{
				ListNode p = head, q =null;
				while((q = p.getNext())!=null)
				{
					if(data==q.getData())
					{
						p.setNext(q.getNext());
					}
					p=q;
				}
			}
			length--;
		}
	}
	
	public  void removeNodeFromPos(int pos)
	{
		ListNode node = head;
		if(pos<0)
			pos = 0;
		if(pos>=length)
			pos=length-1;
		if(node!=null)
		{
			if(pos==0)
			{
				head = node.getNext();
				node.setNext(null);
			}
			else
			{
			ListNode p = head, q = null;
			for(int i =1; i<pos; i++)
			{
				q = p;
				p = q.getNext();
			}
			p.setNext(p.getNext().getNext());
			}
			
			length--;
			
		}
	}
	
	public void display()
	{
		ListNode currentNode = head;
		int data;
		while(currentNode != null)
		{
			data = currentNode.getData();
			System.out.print(data + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
	
	public  int length()
	{
		return length;
	}
	
	public String toString()
	{
		ListNode node = head;
		int data;
		String result = "[";
		if(node == null)
			result = result + "]";
		else
		{
			result = result + node.getData();
			node = node.getNext();
			while(node!=null)
			{
				data = node.getData();
				result = result + "," + data ;
				node = node.getNext();
			}
		}
		
		return result +"]";
		
	}

}
