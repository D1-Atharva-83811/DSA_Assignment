
public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			arr[top] = value;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return arr[top--];
		}
		
	}
	
	public int peek() {
		return arr[top];
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
