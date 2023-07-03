package interview;

import java.util.LinkedHashSet;

public class FindFirstDuplicateChar {

	public static void main(String[] args) {
		String str="aabbcdaef";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(set.add(str.charAt(i))==false);
				System.out.println(str.charAt(i));
				break;
		}
	}
}

