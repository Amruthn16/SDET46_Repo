package HashMap_Prog;

import java.util.HashMap;

public class UniqueNumber_Array {

	public static void main(String[] args) {
		int arr[] = { 1,7,2,3,3,5,4,4};  
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();   

		for (int j = 0; j < arr.length; j++) {   
			map.put(arr[j],j);   
		}  
		for (int UniqNo : map.keySet()) {
			System.out.print(UniqNo+" "); 
		}
	}
}
