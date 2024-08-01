//5. Write a program to implement descending stack. (Initialize top = SIZE)
public class Stack {

	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size){
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int value)
	{
		top--;
		arr[top] = value;
	}
	
	public int pop()
	{
		return arr[top++];
	}
	
	public int peek()
	{
		return arr[top];
		
	}
	
	public boolean isEmpty()
	{
		return top == SIZE;
	}
	
	public boolean isFull()
	{
		return top == 0;
	}
	
}

