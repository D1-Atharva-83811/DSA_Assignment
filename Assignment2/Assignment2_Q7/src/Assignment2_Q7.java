import java.util.Arrays;

//7. Create an array of integers. Reverse the array using stack


public class Assignment2_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		
		Stack stk = new Stack(5);
		
		System.out.println("Normal : "+ Arrays.toString(arr) );
		
		for(int i=0; i<arr.length ; i++)
		{
			stk.push(arr[i]);
		}
		for(int i=0; i<arr.length ; i++)
		{
			arr[i] = stk.pop();
		}
		
		System.out.println("reverse : "+ Arrays.toString(arr));
	}

}
