package Strings;

public class Palindrome_In_Array {

	public static void main(String[] args) {

		String [] a= {"mom", "dad", "sister", "deed"};
		
		
		for (int i = 0; i < a.length; i++) {
			String rev="";
			for (int j = 0; j <a[i].length(); j++) {
				rev=a[i].charAt(j)+rev;
			}
			if(rev.equals(a[i])) {
				System.out.println(a[i]+" is palindrome");
			}else {
				System.out.println(a[i]+" is not palindrome");
			}
		}
	}
}
