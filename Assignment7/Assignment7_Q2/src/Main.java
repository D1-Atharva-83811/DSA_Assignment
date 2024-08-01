import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//2. Calculate the mode of an array. The mode is the element occurred maximum time in the array
public class Main {

	public static void main(String[] args) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		int[] arr = new int[] {11,22,33,11,55,61,11};
		int num =0;
		int oc =0;
		for(int i: arr) {
			if(mp.containsKey(i)) {
				int val =  mp.get(i)+1;
				mp.put(i, val);	
			}else {
				mp.put(i, 1);
			}
		}
		
		for(Entry e : mp.entrySet()) {
			if((int)e.getValue() > oc) {
				oc = (int) e.getValue();
				num = (int) e.getKey();
			}
		}
		
		System.out.println("Mode of Array: "+num+" and cnt of occurence: "+oc );
		
	}

}
