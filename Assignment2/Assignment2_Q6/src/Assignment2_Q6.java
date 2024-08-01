import java.util.Scanner;

//6. Insert 5 elements in stack and find maximum value in stack without traversing it.

public class Assignment2_Q6 {

	public static void main(String[] args) {
		
		Stack stk = new Stack(5);
		Scanner sc = new Scanner(System.in);
		
		while(!stk.isFull()) {
			System.out.println("Enter value");
			int val = sc.nextInt();
			if( stk.isEmpty() ||val>=stk.peek() ){
				stk.push(val);
			}
			else {
				int v=stk.pop();
				stk.push(val);
				stk.push(v);
			}	
			
		}
		
		System.out.println("Maximum value in stack is : "+stk.pop());
		
		
		
		
		
	}

}
