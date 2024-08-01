package ques1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack ls = new LinkedStack();
		LinkedQueue lq = new LinkedQueue();
		
		System.out.println("stack");
		ls.push(1);
		ls.push(2);
		ls.push(3);
		while(!ls.isEmpty()) 
			System.out.print(ls.pop()+" ");
		System.out.println();
		
		System.out.println("Queue");
		lq.push(1);
		lq.push(2);
		lq.push(3);
		
		while(!lq.isEmpty()) 
			System.out.print(lq.pop()+" ");
		System.out.println();
	}

}
