package interview;

public class Aeiou {

	public static void main(String[] args) {

		String str= "aeiou";
		String rev="";
		for (int i = 0; i<str.length(); i++) {
				rev=rev+str.charAt(i);
				System.out.println(rev);
		}
	}
}
