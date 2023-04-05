package interview;

import java.util.TreeSet;

public class PrintCharInStringStoredOrder {

	public static void main(String[] args) {
		
		String st="AmRutH"; //A H R
		TreeSet<Character> set=new TreeSet<>();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z') {
				set.add(ch);
			}
		}
		for (Character c : set) {
			System.out.print(c+" ");

		}
	}

}
