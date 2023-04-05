package Strings;

public class StringPalindrome_2 {

	public static void main(String[] args) {

		String st="deed";

		String rev="";
		for (int i = 0; i < st.length(); i++) {
			rev=st.charAt(i)+rev;
		}
		if(rev.equals(st)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
}
