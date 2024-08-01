
public class MinHeap {
	int size;
	int arr[];
	

	public MinHeap(int arrsize ) {
		size = 0;
		arr = new int[arrsize +1];
	}

	public void addHeap(int val) {
		size++;
		arr[size] = val;

		int ci = size;
		int pi = size / 2;

		while (pi >= 1) {

			if (arr[ci] > arr[pi])
				break;
			int min = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = min;

			ci = pi;
			pi = ci / 2;
		}

	}

	public int delHeap() {
		int min = arr[1];
		arr[1] = arr[size];
		arr[size] = min;

		size--;

		int pi = 1;
		int ci = pi * 2;

		while (ci <=size) {
			if((ci + 1) <= size && arr[ci + 1] < arr[ci])
			ci = ci + 1;
			
		if (arr[ci] > arr[pi])
			break;
		
		int val = arr[ci];
		arr[ci] = arr[pi];
		arr[pi] = val;
		
		pi =ci;
		ci = pi *2;
		
	}
		return min;
	}
	
	public int peek() {
		return arr[1];
	}

}
