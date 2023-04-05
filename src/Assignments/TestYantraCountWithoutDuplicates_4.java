package Assignments;

import java.util.LinkedHashSet;

public class TestYantraCountWithoutDuplicates_4 {

	public static void main(String[] args) {

		String st= "TestYantra";
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		
		for(int i=0; i<st.length();i++){
			set.add(st.charAt(i));
		}
		for(Character ch : set){
			for(int i=0; i<st.length(); i++){
				if(ch==st.charAt(i)){
				System.out.println(ch+" is in "+(i+1)+" position");
				break;
				}
			}
		}
	}
}
