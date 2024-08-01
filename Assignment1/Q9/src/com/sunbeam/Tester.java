package com.sunbeam;

public class Tester {

	public static int SelectionSort(int[] arr) {
		int count=0, temp;
		for(int i=0; i < arr.length-1 ; i++) {
			for(int j=i+1;  j<arr.length; j++) {
				count++;
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}					
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,10,6,21,8,2,20};
		System.out.println("No. of Comparisons : "+SelectionSort(arr));
		System.out.println("Sorted Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}
