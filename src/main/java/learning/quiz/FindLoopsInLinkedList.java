package learning.quiz;

public class FindLoopsInLinkedList {
	public static void main(String args[]) {
		FindLoopsInLinkedList finder = new FindLoopsInLinkedList();
		MyLinkedList sampleList = new MyLinkedList();
		// First Insert randomly ten elements in a linked list
		for (int i = 0; i < 10; i++) {
			sampleList.add(i);
		}
		System.out.println("Loop Existence : " + finder.doesLoopExist(sampleList));
		System.out.println("Loop Existence : " + finder.doesLoopExist(finder.createLoop(sampleList)));
	}

	public boolean doesLoopExist(MyLinkedList listToCheck) {
		MyLinkedList.Node tortoise = listToCheck.getStart();
		MyLinkedList.Node hare = listToCheck.getStart();

		try {
			while (true) {
				tortoise = tortoise.getNext();
				hare = hare.getNext().getNext();
				if (tortoise == hare) {
					return true;
				}
			}
		} catch (NullPointerException ne) {
			return false;
		}
	}

	private MyLinkedList createLoop(MyLinkedList sampleList) {
		sampleList.getStart().getNext().getNext().getNext().setNext(sampleList.getStart().getNext());
		return sampleList;
	}
}

class MyLinkedList {

	private Node start;

	public void add(Integer i) {
		Node node = new Node(i);
		if (start == null)
			start = node;
		else {
			Node temp = start;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public Node getStart() {
		return start;
	}

	static class Node {
		private Integer value;
		private Node next;

		Node(Integer i) {
			this.value = i;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
