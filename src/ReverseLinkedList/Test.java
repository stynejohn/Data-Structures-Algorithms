package ReverseLinkedList;
import ReverseLinkedList.LinkedList.ListNode;

public class Test {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// inserting data to the list
		list.push(100);
		list.push(34);
		list.push(12);
		list.push(123);
		list.push(345);
		list.push(897);
		list.push(8);
		
		System.out.println("original list is ::");
		// display the list
		list.display();
		
		list.reverse();
		
		System.out.println("\n\n"+"reversed list is ::");
		list.display();
		

	}	
}

