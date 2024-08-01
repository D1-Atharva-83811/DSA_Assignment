package ques2;

public class DoublyLinkedList {
	static class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=prev=null;
		}
	}
	
	Node head,tail;
	
	public DoublyLinkedList() {
		head=tail=null;
	}
	
	public void addFirst(int val) {
		if(head==null) {
			head=tail=new Node(val);
			return;
		}
		Node n = new Node(val);
		n.next=head;
		head.prev=n;
		head=n;
	}
	
	public void addLast(int val) {
		if(head==null) {
			head=tail=new Node(val);
			return;
		}
		Node n = new Node(val);
		tail.next=n;
		n.prev=tail;
		tail=n;
	}
	
	public void popFirst() {
		if(head==null) {
			System.out.println("empty");
			return;
		}
		if(head.next==null) {
			head=tail=null;
			return;
		}
		head.next.prev=null;
		head=head.next;
	}
	public void popLast() {
		if(head==null) {
			System.out.println("empty");
			return;
		}
		if(head.next==null) {
			head=tail=null;
			return;
		}
		tail.prev.next=null;
		tail=tail.prev;
	}
	
	public void display() {
		Node tmp=head;
		while(tmp!=null) {
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}
	
	public int peekFirst() {
		if(head==null) {
			System.out.println("empty");
			return -1;
		}
		return head.data;
	}
	public int peekLast() {
		if(head==null) {
			System.out.println("empty");
			return -1;
		}
		return tail.data;
	}
	
	public void addPos(int pos,int val) {
		if(pos==0) {
			addFirst(val);
			return;
		}
		if(head==null) {
			System.out.println("empty");
			return;
		}
		Node tmp=head;
		for(int i=0;i<pos-1 && tmp!=null;i++) {
			tmp=tmp.next;
		}
		Node n=new Node(val);
		n.next=tmp.next;
		n.prev=tmp;
		tmp.next=n;
	}
	public void delPos(int pos) {
		if(head==null) {
			System.out.println("empty");
			return;
		}
		Node tmp=head;
		for(int i=0;i<pos-1 && tmp!=null;i++) {
			tmp=tmp.next;
		}
		if(pos==0) {
			popFirst();
			return;
		}
		if(tmp.next.next==null) {
			popLast();
			return;
		}
		tmp.next.next.prev=tmp;
		tmp.next=tmp.next.next;
	}
}

class Deque extends DoublyLinkedList{
	
}
