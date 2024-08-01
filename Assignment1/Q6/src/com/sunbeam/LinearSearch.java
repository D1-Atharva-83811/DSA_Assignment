package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

public static int Linearsearch(int arr[], int key, int occur) {
		int count = 0;
		for (int i=0; i<arr.length; i++) {
		if(arr[i]==key) {	
			count++;
			if(count == occur)
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
		System.out.println("Enter the occurance of key to find : ");
		int n = sc.nextInt();
		int index = Linearsearch(arr, key, n);
		if(index == -1)
			System.out.println("Key not found");
		else
			System.out.println(n+"th Occurrence of key is at index "+index);		
	}

}
