package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInSentence_7 {

	public static void main(String[] args) {

		String s="I am from from am Bangalore";

		String st = s.toLowerCase();
		String[] words = st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();

		for(int i=0; i<words.length;i++){
			set.add(words[i]);
		}
		for(String str: set){
			System.out.print(str+" ");
			}
		}
	}

