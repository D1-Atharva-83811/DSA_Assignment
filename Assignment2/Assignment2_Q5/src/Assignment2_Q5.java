import java.util.Scanner;

public class Assignment2_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack(5);
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
				if (stk.isFull()) {
					System.out.println("Stack is full");
				} else {
					System.out.println("enter value ");
					stk.push(sc.nextInt());
				}
				break;

			case 2:
				if (stk.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("popped element: "+stk.pop());
				}
				break;

			case 3:
				System.out.println("element: "+stk.peek());
				break;

			default:
				System.out.println("enter correct choice");
				break;
			}
		} while (choice != 0);
	}

}
