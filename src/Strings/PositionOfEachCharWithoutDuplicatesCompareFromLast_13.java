package Strings;

import java.util.LinkedHashSet;

public class PositionOfEachCharWithoutDuplicatesCompareFromLast_13 {

	public static void main(String[] args) {

		String s="Tester"; //r-6,s-3,e-5,t-4
		String st=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<>();

		for(int i=0; i<st.length();i++){
			set.add(st.charAt(i));
		}
		for(Character ch : set){
			for(int i=st.length()-1; i>=0; i--){
				if(ch==st.charAt(i)){
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}
		}
	}
}
