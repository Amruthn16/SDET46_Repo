package Strings;

import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicate_17 {

	public static void main(String[] args) {

		String s="India"; //2
		String st=s.toLowerCase();
		char[] c=st.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < c.length; i++) {
			set.add(c[i]);
		}
		int count=0;
		for (Character ch: set) {
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
				count++;
				System.out.print(ch+ " ");
			}
		}
		System.out.println();
		System.out.println("No of vowels present --> "+count);

	}

}
