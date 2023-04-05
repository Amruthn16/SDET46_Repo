package practice;

import java.util.LinkedHashSet;

public class StringPattern_1 {

	public static void main(String[] args) {

		String str="aaabbcdddf"; //a3b2cd3f
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		for (Character c : set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(c==ch[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(c+""+count); //a3
			}
			if(count==1) {
				System.out.print(c); //c
			}
		}
	}
}
