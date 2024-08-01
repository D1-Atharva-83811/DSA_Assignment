package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {
	
	public static int LinearSearch(int arr[], int key) {
		
		for (int i= arr.length-1; i >=0; i--) {
		if(arr[i]==key) {	
			return i;
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,5,20,30,20,10,5,30};
		System.out.println("Enter the key to find : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = LinearSearch(arr, key);
		if(index == -1)
			System.out.println("Key not found");
		else
			System.out.println("Last Occurrence of key is at index "+index);
		
	}

}
