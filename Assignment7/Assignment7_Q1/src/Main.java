
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


//1. Count occurrences of each word in a line/file.
public class Main {

	public static void main(String[] args) {
	Map<String, Integer> mp = new HashMap<String,Integer> ();
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String line");
	String str = sc.nextLine();
	
	String[] arr = str.split(" ");
	
	for(String s : arr) {
		if(mp.containsKey(s)) {
			int val =mp.get(s)+1;
		  mp.put(s, val);
		}else {
			mp.put(s, 1);
		}
	}
	
	for(Entry s : mp.entrySet()) {
		System.out.println(s.getKey()+" " + s.getValue());
	}
	
	
	}

}
