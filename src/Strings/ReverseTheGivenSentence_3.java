package Strings;

public class ReverseTheGivenSentence_3 {

	public static void main(String[] args) {

		String st="I am from Bangalore"; //Bangalore from am I 

		String[] words = st.split(" ");
		for (int i = words.length-1; i >=0; i--) {
			System.out.print(words[i]+" ");
		}
	}
}
