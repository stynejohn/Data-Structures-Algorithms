package DetectLoopSingleLinkedList;

import DetectLoopSingleLinkedList.LinkedList.ListNode;

//Driver Program to Test Loop Scenario
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

		// display the list
		list.display();

		// length of the list
		System.out.println("\n" + "\n" + "length of the list is::" + list.getLength());

		int i = 1;
		ListNode currentNode = list.head;

		// creating loop in the list
		while (i <= list.getLength()) {
			if (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			i++;
		}
		
		//a cycle is created between second node and last node
		currentNode.next = list.head.next;
		
		//calling detect cycle method
		boolean isCycle = list.detectCycle(list.head);
		if(isCycle)
			System.out.println("\n"+"cycle present");
		else
			System.out.println("\n"+"no cycle in list");
	}

}
