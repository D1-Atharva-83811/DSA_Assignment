
public class MinHeap {
	int size;

	public MinHeap() {
		size = 0;
	}

	public void addHeap(int arr[]) {
		size++;

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

	public int delHeap(int arr[]) {
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
	
	public void heapSort(int arr[]) {
		//1. create heap
		for(int i = 1 ; i < arr.length ; i++)
			addHeap(arr);
		//2. delete heap
		for(int i = 1 ; i < arr.length ; i++)
			delHeap(arr);
	}

}
