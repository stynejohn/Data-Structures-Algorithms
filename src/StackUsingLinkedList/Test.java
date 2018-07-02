package StackUsingLinkedList;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	static boolean continueChoice = true;
	static int input;
	static Stack stack = new Stack();

	public static void main(String[] args) {
		int data;
		do {

			System.out.println("\n*********************\n");
			System.out.println("1.Push data\n2.Pop data\n3.Check empty stack or not\n4.Return top of the satck"
					+ "\n5.Return size of the stack\n6.Returns elements of the stack\n7.Exit");
			int choice = getChoice();
			String result;
			switch (choice) {
			case 1:
				System.out.println("enter the data to be pushed");
				data = sc.nextInt();
				stack.push(data);
				System.out.println("Stack after desired operation is");
				result = stack.toString();
				System.out.println(result);
				break;
			case 2:
				try
				{
				data = stack.pop();
				System.out.println("The data removed is::" + data);
				System.out.println("Stack after desired operation is");
				result = stack.toString();
				System.out.println(result);
				}
				catch(EmptyStackException e)
				{
					e.printStackTrace();
				}
				break;
			case 3:
				boolean isempyty = stack.isEmpty();
				System.out.println(isempyty);
				break;
			case 4:
				try
				{
				data = stack.peek();
				System.out.println("Top data of the stack is::" + data);
				}
				catch(EmptyStackException e)
				{
					e.printStackTrace();
				}
				break;
			case 5:
				data = stack.size();
				System.out.println("Size of the stack is::" + data);
				break;
			case 6:
				String resultString = stack.toString();
				System.out.println(resultString);
				break;
			case 7:
				continueChoice = false;

			}

		} while (continueChoice == true);
	}

	public static int getChoice() {
		input = sc.nextInt();
		return input;
	}

}
