package com.sunbeam;

public class Tester {

	public static int NonRepeating(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			for(; j < arr.length; j++) {
				if(i != j && arr[i]==arr[j] ) {
					break;
				}
			}
			if(j == arr.length)
				return arr[i];
		}
		return -2;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int ele = NonRepeating(arr);
		if(ele == -2)
			System.out.println("No Non Repeating element found");
		else {
			System.out.println("First Non Repeating element : "+ele);
		}
	}

}
