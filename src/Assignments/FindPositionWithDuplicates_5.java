package Assignments;

import java.util.ArrayList;

public class FindPositionWithDuplicates_5 {

	public static void main(String[] args) {

		String s="i am am from i testyantra";
		String[] words = s.split(" ");
		ArrayList<String> list= new ArrayList<String>();
		for(int i=0; i<words.length;i++){
			list.add(words[i]);
		}
		for(String s1:list){
			for(int i=0; i<words.length;i++){
				if(s1==words[i]){
					System.out.println(s1+" ---> "+(i+1));
				}
			}
		}
	}
}
