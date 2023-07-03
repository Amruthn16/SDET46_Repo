package Strings;

public class RemoveDuplicatesUsingIndex {

	public static void main(String[] args) {

		String st = "agmmruuth";
		String rev = "";
		for (int i = 0; i < st.length(); i++) {
			if(rev.indexOf(st.charAt(i))==-1) { //if char is not present it will go inside 
				rev=rev+st.charAt(i);
			}
		}	
		System.out.println(rev);
	}
}
