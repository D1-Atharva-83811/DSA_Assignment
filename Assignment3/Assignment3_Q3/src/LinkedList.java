import java.util.Stack;

public class LinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newnode;
		}
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;

			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			return;
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
		if (head == null) {
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}

	public void deletePosition(int pos) {
		if (head == null) {
			return;
		} else if (pos <= 1) {
			deleteFirst();
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next.next != null; i++) {
				trav = trav.next;

			}
			trav.next = trav.next.next;
		}
	}

	public void display() {
		Node trav = head;
		Stack<Integer> stk = new Stack<Integer>();
		while (trav != null) {
			 stk.push( trav.data);
			trav = trav.next;
		}
		while(!stk.empty()) {
		System.out.print(" "+stk.pop());
		}
	}
	
	public void addAfter(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;

			for (int i = 1; i <= pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
		
		public void addbefore(int value, int pos) {
			Node newnode = new Node(value);
			if (head == null) {
				head = newnode;
			} else if (pos <= 1) {
				addFirst(value);
			} else {
				Node trav = head;

				for (int i = 1; i < pos - 2 && trav.next != null; i++) {
					trav = trav.next;
				}
				newnode.next = trav.next;
				trav.next = newnode;
			}
	}

}
