package Assignments;

import java.util.LinkedHashSet;

public class TestYantraCountDuplicates_4 {

	public static void main(String[] args) {

		String st= "TestYantra";
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		
		for(int i=0; i<st.length();i++){
			set.add(st.charAt(i));
		}
		for(Character ch : set){
			int count=0;
			for(int i=0;i<st.length();i++){
				if(ch==st.charAt(i)){
				count++;
				}
			}
			if(count>1){
				System.out.println(ch+" ----> "+count);
			}
		}
	}
}
