package HashMap_Prog;

import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicate_Array {

	public static void main(String[] args) {
		int[] arr = {1,7,2,3,3,5,4,4};

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int ele : arr) {   
			
			if(map.get(ele) == null){
				map.put(ele, 1);
				
			}else{
				map.put(ele, map.get(ele)+1);
			}
		}
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() >1){
				System.out.println("Duplicate Element: "+entry.getKey()+" found "+entry.getValue()+" times.");
			}
		}
	}
}
