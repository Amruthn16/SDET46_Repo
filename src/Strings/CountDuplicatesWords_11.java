package Strings;

import java.util.LinkedHashSet;

public class CountDuplicatesWords_11 {

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
			if(count>1) {
			System.out.println(str+" ---> "+count+ " times");
			}
		}
		
		//===============
//		String st= "java selenium Api java";
//		String[] str = st.split(" ");
//
//		for (int i = 0; i < str.length; i++) {
//			 boolean flag = false;
//			for (int j = i+1; j < str.length; j++) {
//				if(str[i].equals(str[j])) {
//				flag=true;
//				}
//			}
//			if(flag==false) {
//				System.out.print(str[i]+" ");
//			}
//		}
		
	}
}

