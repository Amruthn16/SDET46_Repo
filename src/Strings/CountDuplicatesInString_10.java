package Strings;

import java.util.LinkedHashSet;

public class CountDuplicatesInString_10 {

	public static void main(String[] args) {

		String s="TestYantra";
		String st = s.toLowerCase();

		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < st.length(); i++) {
				if(ch==st.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch+" ---> "+count+" times");
			}
		}
		
		
//		String st= "Java";
//		char[] ch = st.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//			int count=1;
//			for (int j = i+1; j < ch.length; j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//				}
//				System.out.print(ch[i]+""+count);
//			}
//		}
//
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]+"");
//	}
		
	}
}
