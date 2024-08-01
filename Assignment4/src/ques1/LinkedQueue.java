package ques1;

import java.util.LinkedList;

public class LinkedQueue {
	LinkedList<Integer> l ;
	
	public LinkedQueue() {
		l = new LinkedList<>();
	}
	
	public void push(int val) {
		l.add(val);
	}
	
	public int pop() {
		return l.poll();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
	}
	
	public int peek() {
		return l.peek();
	}
}
