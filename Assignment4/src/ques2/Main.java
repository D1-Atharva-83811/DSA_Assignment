package ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dq = new Deque();
		Scanner sc = new Scanner(System.in);
		int c=0;
		do {
			System.out.println("0-exit | 1-addfirst | 2-addLast | 3-delFirst | 4-delLast | 5-addPos | 6-delPos | 7-display");
			c=sc.nextInt();
			switch(c) {
			case 0:break;
			case 1:dq.addFirst(sc.nextInt()); break;
			case 2:dq.addLast(sc.nextInt()); break;
			case 3:dq.popFirst(); break;
			case 4:dq.popLast(); break;
			case 5:dq.addPos(sc.nextInt(), sc.nextInt()); break;
			case 6:dq.delPos(sc.nextInt()); break;
			case 7:dq.display();
			}
		}while(c!=0);
	}

}
