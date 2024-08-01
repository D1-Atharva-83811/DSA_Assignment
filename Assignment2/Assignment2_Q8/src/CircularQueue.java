
public class CircularQueue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	int cnt;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		cnt =0;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		cnt++;
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int value = arr[(front + 1) % SIZE];

		front = (front + 1) % SIZE;

		if (front == rear)
			front = rear = -1;
		cnt--;

		return value;

	}

	public int peek() {

		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		return arr[(front + 1)%SIZE];
	}

	public boolean isEmpty() {
		return cnt == 0;
	}

	public boolean isFull() {
		return cnt == SIZE;
	}
}
