package com.sunbeam;

import java.util.Scanner;

public class Palindrome {
	
	public static int Palindrome(int n) {
		
		int sum=0, rem;
		while(n != 0) {
			rem=n%10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		return sum;
	}
	
	public static int RecursivePalindrome(int n, int sum) {		
		if(n == 0)
			return sum;
		sum = sum * 10 + (n%10);
		return RecursivePalindrome(n/10, sum);		
	}
	
	public static boolean IsStringPalindrome(String str) {
		int end = str.length()-1;
		for(int i = 0; i < str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(end))
				return false;	
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			System.out.println("Enter a number : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(RecursivePalindrome(n,0));
			String str = Integer.toString(n);
			if(IsStringPalindrome(str))
				System.out.println("No is a palindrome");
			else
				System.out.println("No. is not a palindrome");
			
			
//			/*
//			 * int rev = Palindrome(n); if(rev == n)
//			 * System.out.println("No is a palindrome"); else
//			 * System.out.println("No. is not a palindrome");
//			 */
			
	}

}
