
public class PriorityQueue {
	MinHeap h;
	
	public PriorityQueue(int size) {
		h = new MinHeap(size);
	}

	public void push(int val) {
		h.addHeap(val);
	}
	
	public int pop() {
		int val = h.delHeap();
		return val;
	}
	
	public int peek() {
		return h.peek();
	}
}
