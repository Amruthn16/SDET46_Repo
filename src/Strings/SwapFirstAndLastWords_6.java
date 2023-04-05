package Strings;

public class SwapFirstAndLastWords_6 {

	public static void main(String[] args) {

		String st="I am from Bangalore"; //Bangalore am from I 

		String[] w = st.split(" ");
		int first=0;
		int	last=w.length-1;
		
		String temp =w[first];
		w[first]=w[last];
		w[last]=temp;
		
		for (int i = 0; i<w.length; i++) {
			System.out.print(w[i]+ " ");
		}
	}
}
