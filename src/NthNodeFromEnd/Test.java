package NthNodeFromEnd;

import java.util.Scanner;

import NthNodeFromEnd.LinkedList.ListNode;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		ListNode head = list.head;

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

		System.out.println("\n\nEnter the nth node you want to search, make sure n > 0");
		int data = sc.nextInt();
		ListNode returnNode = list.NthNodeFromEnd(data);
		if (returnNode != null)
			System.out.println("\n\n" + "Nth node from the end is ::" + returnNode.data);
		else
			System.out.println("No such Node exists");

	}
}
