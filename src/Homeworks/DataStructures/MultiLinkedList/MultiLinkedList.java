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
}
