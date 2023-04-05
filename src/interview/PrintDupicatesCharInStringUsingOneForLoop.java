package interview;

import java.util.HashSet;

public class PrintDupicatesCharInStringUsingOneForLoop {

	public static void main(String[] args) {
		
		String str="testyantra"; //t t a
		HashSet<Character> set= new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(set.contains(ch)) {
				System.out.print(ch+" ");
			}else {
				set.add(ch);
			}
		}
	}
}
