package Strings;


public class FindMinmumLengthInString_18 {

	public static void main(String[] args) {

		String[] st= {"ab", "a", "abc", "abcd", "b"}; //a  b
		String[] num= {"12", "3", "321", "1234", "4"};
		
		String min=st[0];
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()<min.length()) {
				min=st[i];
			}
		}
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()==min.length()) {
				System.out.println("String with minimun length --> "+ st[i]);			
			}
		}
	}
}
