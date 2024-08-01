package ques1;

import java.util.LinkedList;

public class LinkedStack {
	LinkedList<Integer> l ;
	
	public LinkedStack() {
		l = new LinkedList<>();
	}
	
	public void push(int val) {
		l.add(val);
	}
	
	public int pop() {
		return l.pollLast();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
	}
	
	public int peek() {
		return l.peekLast();
	}
	
}
