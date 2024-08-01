package com.sunbeam;

import java.util.Scanner;

public class Tester {
	
	public static int getRank(int[] arr, int key) {
		int count=0;
		for(int i=0; i <arr.length ; i++) {
			if(arr[i] <= key)
				count++;
		}
		if(count == 0)
			return 0;
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the key to find its rank: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Rank of "+key+" is : "+getRank(arr, key));
	}

}
