import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap hp = new MinHeap();

		int arr[] = new int[] { 0, 55, 21, 3, 16, 28, 57, 36, 15 };

		hp.heapSort(arr);

		System.out.println(" " + Arrays.toString(arr));
	}

}
