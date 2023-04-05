package Assignments;

import java.util.LinkedHashSet;

public class CountNoOfDuplicateWords_5 {

	public static void main(String[] args) {

		String st="I am am from i testyantra";
		String[] words = st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		for(int i=0; i<words.length;i++){
			set.add(words[i]);
		}
		for(String s1: set){
			int count=0;
			for(int i=0; i<words.length;i++){
				if(s1.equals(words[i])){
					count++;
				}
			}
			if(count>1) {
			System.out.println(s1+" ---> "+count);
			}
		}
	}

}
