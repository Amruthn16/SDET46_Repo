package Assignments;

import java.util.LinkedHashSet;

public class FindPositionWithoutDuplicates_5 {

	public static void main(String[] args) {

		String st="i am am from i testyantra";
		String[] words = st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0; i<words.length;i++){
			set.add(words[i]);
		}
		for(String s1:set){
			for(int i=0; i<words.length;i++){
				if(s1==words[i]){
					System.out.println(s1+" ---> "+(i+1));
				}
			}
		}
	}
}
