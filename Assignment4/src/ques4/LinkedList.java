package ques4;

import java.util.ArrayDeque;
import java.util.Queue;

import ques2.DoublyLinkedList;

class Operation{
	int key;
	int val;
	
	public Operation(int key) {
		this.key=key;
	}
	public Operation(int key,int val) {
		this.key=key;
		this.val=val;
	}
}

public class LinkedList extends DoublyLinkedList{
	
	Queue<Operation> q;
	
	public LinkedList() {
		q=new ArrayDeque<Operation>();
	}
	
	@Override
	public void addFirst(int val) {
		// TODO Auto-generated method stub
		super.addFirst(val);
		q.add(new Operation(3));
	}

	@Override
	public void addLast(int val) {
		// TODO Auto-generated method stub
		super.addLast(val);
		q.add(new Operation(4));
	}

	@Override
	public void popFirst() {
		// TODO Auto-generated method stub
		int x=super.peekFirst();
		super.popFirst();
		q.add(new Operation(1,x));
	}

	@Override
	public void popLast() {
		// TODO Auto-generated method stub
		int x=super.peekLast();
		super.popLast();
		q.add(new Operation(2,x));
	}

	@Override
	public void addPos(int pos, int val) {
		// TODO Auto-generated method stub
		super.addPos(pos, val);
		q.add(new Operation(6,pos));
	}

	@Override
	public void delPos(int pos) {
		// TODO Auto-generated method stub
		super.delPos(pos);
	}

	public  void undo() {
		int c=0;
		while(!q.isEmpty() && c<5) {
			Operation op=q.poll();
			switch(op.key) {
			case 1:super.addFirst(op.val); break;
			case 2:super.addLast(op.val); break;
			case 3:super.popFirst(); break;
			case 4:super.popLast(); break;
			case 6:super.delPos(op.val); break;
			}
		}
	}
}
