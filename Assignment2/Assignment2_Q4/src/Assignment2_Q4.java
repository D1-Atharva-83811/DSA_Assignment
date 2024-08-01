import java.util.Scanner;

public class Assignment2_Q4 {

	public static void main(String[] args) {

		Queue q = new Queue(5);
		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("0.Exit \n 1.push \n 2.pop \n 3.peek");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("bye");
				break;

			case 1:
				if (q.isFull()) {
					System.out.println("queue is full");
				} else {
					System.out.println("enter value ");
					q.push(sc.nextInt());
				}
				break;

			case 2:
				if (q.isEmpty()) {
					System.out.println("queue is empty");
				} else {
					System.out.println("popped element: "+q.pop());
				}
				break;

			case 3:
				System.out.println("element: "+q.peek());
				break;

			default:
				System.out.println("enter correct choice");
				break;
			}
		} while (choice != 0);
	}
}
