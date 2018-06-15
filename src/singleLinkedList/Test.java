package singleLinkedList;

import java.util.Scanner;

public class Test {

	static Scanner sc = new Scanner(System.in);
	static int choice = 0;
	static LinkedList list = new LinkedList();
	public static void main(String[] args) {
		boolean continueChoice = false;
		int data;
		int pos;
		ListNode node;

		do {
			System.out.println("\n******************************\n");
			System.out.println("1.Length Of The List\n2.Return First Node\n3.Insert At The Beginning"
					+ "\n4.Insert At The End\n5.Insert New Node At Given Position(Index starts from 0 and end at (lengthOfList-1))\n6.Remove Node At Head Of The List\n7.Remove Node At The End Of The List"
					+ "\n8.Remove A Node Matching The Specified Node From The List\n9.Remove The Value At A Given Position\n10.Returns A String Representation Of Collection"
					+ "\n11.Exit");
			System.out.println("\n******************************\n");
			int option = getOptionFromUser();
			int length = list.length();
			switch(option)
			{
			case 1 :
				System.out.println("Length of the list: "+length);
				break;
			case 2 :
				if(length!=0)
				{
				node = list.getHead();
				System.out.println("The data of the head node is:" +node.getData());
				}
				else
					System.out.println("List is empty");
				break;
			case 3:
				System.out.println("Enter The Data To Insert In The Beginning Of The List");
				data = sc.nextInt();
				node = new ListNode(data);
				list.insertAtBegin(node);
				System.out.println("Single Linked List after the chosen operation");
				list.display();
				break;
			case 4:
				System.out.println("Enter The Data To Insert In The End Of The List");
				data = sc.nextInt();
				node = new ListNode(data);
				list.insertAtEnd(node);
				System.out.println("Single Linked List After the chosen operation");
				list.display();
				break;
			case 5:
				System.out.println("Insert the position to enter the node");
				pos = sc.nextInt();
				System.out.println("insert the data to be entered");
				data = sc.nextInt();
				list.insert(pos, data);
				System.out.println("Single Linked List After the chosen operation");
				list.display();
				break;
			case 6:
				list.removeFromBegin();
				System.out.println("Single Linked List After the chosen operation");
				list.display();
				break;
			case 7 :
				list.removeFromEnd();
				System.out.println("Single Linked List After the chosen operation");
				list.display();
				break;
			case 8:
				System.out.println("enter the node to be deleted");
				data = sc.nextInt();
				list.removeData(data);
				System.out.println("Single Linked List After the chosen operation");
				list.display();
				break;
			case 9:
				System.out.println("enter the position of node to be deleted");
				pos = sc.nextInt();
				list.removeNodeFromPos(pos);
				System.out.println("Single Linked List After the chosen operation");
				list.display();
				break;
			case 10:
				String result = list.toString();
				System.out.println(result);
				break;
			case 11:
				continueChoice = true;
				
			}

		} while (!continueChoice);

	}

	public static int getOptionFromUser() {
		System.out.println("Enter Your Choice");
		choice = sc.nextInt();
		return choice;
	}
	
	

}
