package Homeworks.DataStructures.LinkedList;

public class MyLinkedList<T> {

    private Node footerNode;
    private Node headerNode;

    public MyLinkedList() {
        footerNode = null;
        headerNode = null;
    }

    public void addLast(T item) {
        Node node = new Node((T) item, null);

        if (headerNode == null) {
            headerNode = node;
        }

        if (footerNode != null) {
            footerNode.next = node;
        }

        footerNode = node;
    }

    public void addFirst(T item) {
        Node node = new Node((T) item, null);

        if (headerNode == null) {
            footerNode = node;
        } else {
            node.next = headerNode;
        }

        headerNode = node;

    }

    public void addWithIndex(int index, T item) {
        Node addedNode = new Node((T) item, null);
        Node node = headerNode;

        if (index == 0) {
            addFirst(item);
            return;
        }

        if (index == length()) {
            addLast(item);
            return;
        }

        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        addedNode.next = node.next;
        node.next = addedNode;
    }

    public int length() {
        Node node = headerNode;

        int result = 0;
        while (node != null) {
            node = node.next;
            result++;
        }
        return result;
    }

    public void removeLast() {
        Node node = headerNode;

        if (node == footerNode) {
            headerNode = null;
            footerNode = null;
            return;
        }

        while (node.next != footerNode) {
            node = node.next;
        }
        node.next = null;
        footerNode = node;
    }

    public void removeFirst() {
        Node node = headerNode;
        headerNode = node.next;
    }

    public void removeWithIndex(int index) {
        Node node = headerNode;

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == length() - 1) {
            removeLast();
            return;
        }

        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        node.next = node.next.next;
    }

    public void clear() {
        headerNode = null;
        footerNode = null;
    }

    public void printList() {
        Node node = headerNode;
        System.out.print("[");

        while (node != null) {
            String symbol = (node == footerNode) ? "" : ", ";
            System.out.print(node.value + symbol);
            node = node.next;
        }

        System.out.println("]");
    }
}
