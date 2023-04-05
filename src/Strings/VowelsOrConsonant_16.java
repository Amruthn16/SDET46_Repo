package Strings;

public class VowelsOrConsonant_16 {

	public static void main(String[] args) {

		String s="b";  //vowel --> b
		String st=s.toLowerCase();
		char[] ch=st.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
				System.out.println("vowel -->"+ ch[i]);
			}else {
				System.out.println("Consonant -->"+ ch[i]);

			}
		}
//		vowelsOrConsonant('E');  //It is vowel
	}

	public static void vowelsOrConsonant(char ch) {
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
			ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
			System.out.println("It is vowel");
		}else {
			System.out.println("It is Consonant");

		}
	}
}


