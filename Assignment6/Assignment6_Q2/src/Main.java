
public class Main {

	public static void main(String[] args) {
		
		PriorityQueue pq  =  new PriorityQueue(5);
		
		pq.push(50);
		pq.push(30);
		pq.push(20);
		pq.push(10);
		pq.push(40);
		
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		

	}

}
