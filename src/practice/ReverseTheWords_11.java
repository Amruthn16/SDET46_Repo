package practice;

public class ReverseTheWords_11 {

	public static void main(String[] args) {

		String st="my name is ok"; //ko si eman ym

		String[] words = st.split(" ");
		for (int i = words.length-1; i>=0 ; i--) {
			String str=words[i];

			for (int j =str.length()-1; j>=0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
