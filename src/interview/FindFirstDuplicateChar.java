package interview;

import java.util.LinkedHashSet;

public class FindFirstDuplicateChar {

	public static void main(String[] args) {
		String str="aabbcdef";
		boolean flag=false;
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			flag=set.add(str.charAt(i));
			if(flag==false) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}

