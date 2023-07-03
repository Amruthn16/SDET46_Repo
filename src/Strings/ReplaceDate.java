package Strings;

public class ReplaceDate {

	public static void main(String[] args) {

		String str="07/05/2023";
		System.out.println(str.replace("/", "-"));
		
		//=====================
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='/') {
				ch[i]='-';
			}
			System.out.print(ch[i]);
		}
		
	}

}
