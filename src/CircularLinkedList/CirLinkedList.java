package CircularLinkedList;

public class CirLinkedList {

	private CLLNode tail;
	private int length;

	public CirLinkedList() {
		tail = null;
		length = 0;
	}

	public void add(int data) {
		insertAtTheBeginning(data);
	}

	public void insertAtTheBeginning(int data) {
		CLLNode temp = new CLLNode(data);
		if (tail == null) {
			tail = temp;
			tail.setNext(tail);
		} else {
			temp.setNext(tail.getNext());
			tail.setNext(temp);
		}

		length++;
	}

	public void insertAtTheEnd(int data) {
		insertAtTheBeginning(data);
		tail = tail.getNext();
		length++;
	}

	public void display() {
		if (tail == null)
			return;
		CLLNode currentNode = tail.getNext();
		while (currentNode != tail) {
			System.out.print(currentNode.getData() + "->");
			currentNode = currentNode.getNext();
		}
		System.out.print(currentNode.getData());
	}

	public int removeReturnsHeadData() {

		if(tail!=null)
		{
	    CLLNode currentNode = tail.getNext();
		if (currentNode == tail)
			tail = null;
		else {
			tail.setNext(currentNode.getNext());
			currentNode.setNext(null);
		}
		length--;
		return currentNode.getData();
		}
		return 0;
	}

	public int removeReturnsTailData() {
		CLLNode temp = tail;
		int data = 0;
		if (tail != null) {
			CLLNode currentNode = tail.getNext();
			while (currentNode != tail) {
				temp = currentNode;
				currentNode = currentNode.getNext();
			}
			if (temp == currentNode)
			{
				tail = null;
				return (temp.getData());
				
			}
			else {
				temp.setNext(currentNode.getNext());
				tail = temp;
				return (currentNode.getData());
			}

		}
		length--;
		return data;
	}

	public boolean containsData(int data) {
		if (tail == null)
			return false;
		else {
			if (tail.getData() == data) {
				return true;
			} else {
				CLLNode currentNode = tail.getNext();
				while ((currentNode != tail) && !(currentNode.getData() == data)) {
					currentNode = currentNode.getNext();
				}
				if (currentNode == tail)
					return false;
				else
					return true;
			}
		}
	}

	public void removeGivenDataNode(int data) {
		if (tail == null)
			return;
		int comparisons;
		CLLNode currentNode = tail.getNext();
		CLLNode prevNode = tail;
		for (comparisons = 0; comparisons < length && !(currentNode.getData() == data); comparisons++) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (currentNode.getData() == data) {
			// if there is only one node in the list
			if (tail == tail.getNext())
				tail = null;
			else {
				if (currentNode == tail)
					tail = prevNode;
				prevNode.setNext(prevNode.getNext().getNext());
			}
			currentNode.setNext(null);
			length--;
		} else
			System.out.println("The data to be removed is not present in the list");
	}

}
