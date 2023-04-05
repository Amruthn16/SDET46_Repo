package Strings;

public class FindMaximumLengthInString_19 {

	public static void main(String[] args) {

		String[] num= {"ab", "a", "abc", "abcd", "b"}; //abcd
		String[] st= {"12", "3", "321", "1234", "4"}; //1234

		String max=st[0];
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()>max.length()) {
				max=st[i];
			}
		}
		for (int i = 0; i < st.length; i++) {
			if(st[i].length()==max.length()) {
				System.out.println("String with maximun length --> "+ st[i]);			
			}
		}
	}

}
