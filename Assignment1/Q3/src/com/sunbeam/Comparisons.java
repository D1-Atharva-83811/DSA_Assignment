package com.sunbeam;

import java.util.Scanner;

public class Comparisons {

public static int LinearSearch(int arr[], int key) {
		int count = 0;
		for (int i=0; i < arr.length; i++) {
			count++;
		if(arr[i]==key) {			
			return count;
		}
		}
		return count;
	}

public static int BinarySearch(int arr[], int key) {
	int count=0;
	int left = 0;
	int mid;
	int right = arr.length-1;
	while(left <= right) {
		mid= (left + right)/2;
		count++;
		if(key == arr[mid]) {
			return count;
		}else if(key < arr[mid]) {
			right = mid-1;
		}else {
			left = mid + 1;
		}
	}
	return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80};
		int index=-1;
		System.out.println("Enter the key to find : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		System.out.println("No. of Comparisons done in Linear search : "+LinearSearch(arr, key));
		System.out.println("No. of Comparisons done in Binary search : "+BinarySearch(arr, key));
		
	}

}
