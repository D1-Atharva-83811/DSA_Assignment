
public class Queue {
	
	private int[] arr;
	private int rear,front;
	private final int SIZE;
	
	public Queue(int size)
	{
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int val)
	{
		arr[rear++] = val;
		System.out.println("value pushed successfully");
		
	}
	
	public int pop() {
		int val = arr[front++];
		
		return val;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
	
	public boolean isFull()
	{
		return rear == SIZE-1;
	}
}
