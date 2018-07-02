package StackUsingLinkedList;

import java.util.EmptyStackException;

public class Stack {
	
	private int length;
	private ListNode top;
	 public Stack() {
		 length = 0;
		 top = null;
	 }
	 
	 public boolean isEmpty()
	 {
		 return(length==0);
	 }
	 
	 public void push(int data)
	 {
		 ListNode newNode = new ListNode(data);
		 newNode.setNext(top);
		 top = newNode;
		 length++;
	 }

	 public int pop() throws EmptyStackException
	 {
		 if(isEmpty())
		 {
			 throw new EmptyStackException();
		 }
		 
		 int result = top.getData();
		 top = top.getNext();
		 length--;
		 return result;
		 
	 }
	 
	 public int peek() throws EmptyStackException
	 {
		  if(isEmpty())
			  throw new EmptyStackException();
		  return top.getData();
	 }
	 
	 public int size()
	 {
		 return length;
	 }
	 
	 public String toString()
	 {
		 String result = "";
		 ListNode currentNode = top;
		 while(currentNode!=null)
		 {
			 result = result + currentNode.getData() +"\t";
			 currentNode = currentNode.getNext();
		 }
		 return result;
	 }
}
























