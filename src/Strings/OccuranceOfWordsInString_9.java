package Strings;

import java.util.LinkedHashSet;

public class OccuranceOfWordsInString_9 {

	public static void main(String[] args) {
		
		String s="I am from from am Bangalore";
		String st = s.toLowerCase();
		
		String[] words = st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		for(int i=0; i<words.length;i++){
			set.add(words[i]);
		}
		for(String str: set){
			int count=0;
			for(int i=0; i<words.length;i++){
				if(str.equals(words[i])){
					count++;
				}
			}
			System.out.println(str+" ---> "+count+ " times");
		}
	}
}
