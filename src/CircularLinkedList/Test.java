package CircularLinkedList;

import java.util.Scanner;

public class Test {
	
	static Scanner sc = new Scanner(System.in);
	int choice = 0;
	static CirLinkedList cll = new CirLinkedList();	
	
	public static void main(String[] args) {
		
		boolean continueChoice = false;
		int data;
		do {
			System.out.println("\n*****************************************************\n");
			System.out.println("1.Insert At The Beginning\n2.Insert At The End\n3.Returns and removes data from the head of the list"
					+ "\n4.Returns and removes data from the tail of the list\n5.Check whether a given data is present or not"
					+ "\n6.Remove the given node from the list\n7.exit");
			int choice = getchoice();
			switch(choice)
			{
			case 1:
				System.out.println("enter the data");
		        data = sc.nextInt();
				cll.insertAtTheBeginning(data);
				System.out.println("List after the chosen operation");
				cll.display();
				break;
			case 2:
				System.out.println("enter the data");
				data = sc.nextInt();
				cll.insertAtTheEnd(data);
				System.out.println("List after the chosen operation");
				cll.display();
				break;
			case 3:
				data = cll.removeReturnsHeadData();
				System.out.println("the head data is"+data);
				System.out.println("List after the chosen operation");
				cll.display();
				break;
			case 4:
				data = cll.removeReturnsTailData();
				System.out.println("the tail data is"+data);
				System.out.println("List after the chosen operation");
				cll.display();
				break;
			case 5:
				System.out.println("enter the data to check");
				data = sc.nextInt();
				boolean present = cll.containsData(data);
				if(present)
					System.out.println("Data is present");
				else
					System.out.println("Data not found");
				break;
			case 6:
				System.out.println("enter the data node to be removed");
				data = sc.nextInt();
				cll.removeGivenDataNode(data);
				System.out.println("List after the chosen operation");
				cll.display();
				break;
			case 8:
				continueChoice = true;
			}
		}while(!continueChoice);
	}
	
	public static int getchoice()
	{
		int choice = sc.nextInt();
		return choice;
	}

}
