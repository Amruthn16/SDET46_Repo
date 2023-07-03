package interview;

import java.util.LinkedHashSet;

public class vishwasProg {

	public static void main(String[] args) {

		String a="aaaa@@#$bbb^&*cccea";
		char[] st = a.toCharArray();

		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for (int i = 0; i < st.length; i++) {
			if(st[i]>='a' && st[i]<='z') {
				set.add(st[i]);
			}
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < st.length; i++) {
				if(ch==st[i]) {
					count++;
				}
			}
			System.out.print(ch+""+count);
		}
	}
}

