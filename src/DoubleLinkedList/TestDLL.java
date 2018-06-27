package DoubleLinkedList;

import java.util.Scanner;

public class TestDLL {

	static Scanner sc = new Scanner(System.in);
	static int choice = 0;
	static DoubleLinkedList list = new DoubleLinkedList();
	public static void main(String[] args) {
		boolean continueChoice = false;
		int data;
		int pos;
		int positionValue;

		do {
			System.out.println("\n******************************\n");
			System.out.println("1.Insert At The Beginning\n2.Insert At The End\n3.Length of the list\n4.Insert at a given position\n"
					+"5.Find first position in which a given value prsent\n6.Remove head from list\n7.Remove tail from the list\n"
					+ "8.Remove data from a given position\n9.Returns string representation of list\n10.exit");
			System.out.println("\n******************************\n");
			int option = getOptionFromUser();
			switch(option)
			{
			case 1 :
				System.out.println("Enter the data");
				data = sc.nextInt();
				list.insertAtBegin(data);
				System.out.println("Double linked list after the requested operation is::"+" ");
				list.display();
				break;
			
			case 2:
				System.out.println("Enter The Data");
				data = sc.nextInt();
				list.insertAtTheEnd(data);
				System.out.println("Double linked list after the requested operation is::"+ " ");
				list.display();
				break;
			
			case 3:
				System.out.println("The length of the list is "+list.length());
				break;
				
			case 4:
				System.out.println("Enter the position to be which data to be inserted");
				pos = sc.nextInt();
				System.out.println("Enter the data to be inserted");
				data = sc.nextInt();
				list.insertAtGivenPos(pos, data);
				System.out.println("Double linked list after the requested operation is::"+ " ");
				list.display();
				break;
				
			case 5:
				System.out.println("Enter the data to be searched for");
				data = sc.nextInt();
				positionValue = list.returnFirstPositionOfAGivenValue(data);
				if(positionValue==Integer.MIN_VALUE)
					System.out.println("value is not found");
				else
					System.out.println("value present at::"+positionValue);
				break;
			
			case 6:
				list.removeHead();
				System.out.println("Double linked list after the requested operation is::"+ " ");
				list.display();
				break;
				
			case 7:
				list.removeTail();
				System.out.println("Double linked list after the requested operation is::"+ " ");
				list.display();
				break;
			
			case 8:
				System.out.println("Enter the position from which data to be removed");
				pos = sc.nextInt();
				list.removeValueAtGivenPos(pos);
				System.out.println("Double linked list after the requested operation is::"+ " ");
				list.display();
				break;
			case 9:
				String result = list.toString();
				System.out.println(result);
				break;
			case 10:
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
