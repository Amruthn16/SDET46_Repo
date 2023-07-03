package HashMap_Prog;

import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicates_In_String {

	public static void main(String[] args) {

		String str = "harshitha";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(map.get(ch[i]) == null){
				map.put(ch[i], 1);

			}else{
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		
		//System.out.println(map);
		for (Entry<Character, Integer> lt:map.entrySet()) {
			if(lt.getValue()>1) {
			System.out.print(lt+" ");
			}
		}
	}
}
