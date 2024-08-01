//2. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a new node before a given node

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		
		list.addbefore(69, 4);
		//list.addAfter(777, 5);
		//list.addPosition(99898, 5);
		
		list.display();
	}

}
