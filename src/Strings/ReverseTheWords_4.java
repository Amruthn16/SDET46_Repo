package Strings;

public class ReverseTheWords_4{

	public static void main(String[] args) {

		String st="I am from Bangalore"; //I ma morf erolagnaB

		String[] words = st.split(" ");
		for (int i = 0; i<words.length ; i++) {
			String str=words[i];

			for (int j =str.length()-1; j>=0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		} 
	}
}
