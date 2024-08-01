import java.util.Scanner;

public class BinarySearch {
	
	public static int Binarysearch(int arr[], int key, int left, int right) {
		
		int mid;		
		while(left <= right) {
			mid= (left + right)/2;
			if(key == arr[mid]) {
				return mid;
			}else if(key < arr[mid]) {
				return Binarysearch(arr, key, mid+1, right);
			}else {
				return Binarysearch(arr, key, left, mid-1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {60,50,40,30,20,10};
		System.out.println("Enter the key to find : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = Binarysearch(arr, key, 0, arr.length-1);
		if(index == -1)
			System.out.println("Key not found");
		else
			System.out.println("Key found at index "+index);		
	}

}
