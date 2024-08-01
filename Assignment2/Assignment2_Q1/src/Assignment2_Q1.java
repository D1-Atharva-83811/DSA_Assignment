import java.util.Arrays;

//1. Write a insertion sort function to sort array and returns no of comparisions.

public class Assignment2_Q1 {

	public static void insertionSort(int[] arr, int size) {
		for (int i = 1; i < size; i++) {
			
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 2, 5, 1 };

		System.out.println("Array before sort: " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array After sort: " + Arrays.toString(arr));

	}

}
