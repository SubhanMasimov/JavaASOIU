package Homeworks.DataStructures.MultiLinkedList;

public class MultiLinkedList {

	private Node headerNode;

	public MultiLinkedList() {
		headerNode = null;
	}

	public void addLast(Object item) {
		Node addedNode = new Node(item, null, null);

		if (headerNode == null) {
			headerNode = addedNode;
			return;
		}

		Node tempNode = headerNode;

		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = addedNode;
	}

	public void addFirst(Object item) {
		Node node = new Node(item, null, null);

		if (headerNode != null) {
			node.next = headerNode;
		}

		headerNode = node;
	}

	public void addChildItemLast(Object searchedItem, Object addedItem) {
		Node addedNode = new Node(addedItem, null, null);

		Node tempNode = headerNode;
		
		while (tempNode.value != searchedItem) {
			tempNode = tempNode.next;
		}
		
		if(tempNode.child == null) {
			tempNode.child = addedNode;
			return;
		}
		
		Node tempChild = tempNode.child;
		
		while(tempChild.next != null) {
			tempChild = tempChild.next;
		}
		 
		tempChild.next = addedNode;
	}
	
	public void addChildItemFirst(Object searchedItem, Object addedItem) {
		Node addedNode = new Node(addedItem, null, null);

		Node tempNode = headerNode;
		
		while (tempNode.value != searchedItem) {
			tempNode = tempNode.next;
		}
		
		if(tempNode.child == null) {
			tempNode.child = addedNode;
			return;
		}
		
		addedNode.next = tempNode.child;
		tempNode.child = addedNode;
	}

	public void printChildElements(Object item) {
		Node tempNode = headerNode;

		while (tempNode.value != item) {
			tempNode = tempNode.next;
		}
		
		Node tempChild = tempNode.child;
		System.out.print("[");
		
		while(tempChild != null) {
			String symbol = (tempChild.next == null) ? "" : ", ";
			System.out.print(tempChild.value + symbol);
			tempChild = tempChild.next;
		}
		System.out.println("]");
	}

	public void printParentItems() {
		Node node = headerNode;

		System.out.print("[");

		while (node != null) {
			String symbol = (node.next == null) ? "" : ", ";
			System.out.print(node.value + symbol);
			node = node.next;
		}

		System.out.println("]");
	}
}
