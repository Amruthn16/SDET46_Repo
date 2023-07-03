package practice;

import java.util.LinkedHashSet;

public class Add2StringNRemoveDuplicate {

	public static void main(String[] args) {

		String s1="this is fun show"; //this is tv
		String s2= "fun tv show";

		String s3=s1+" "+s2;

		String[] s4 = s3.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();

		for (int i = 0; i < s4.length; i++) {
			set.add(s4[i]);
		}

		for (String word : set) { 
			int count=0;
			for (int i = 0; i < s4.length; i++) {
				if(word.equals(s4[i])) {				
					count++;
				}
			}
			if(count==1)
				System.out.println(word);
		}
	}
}



