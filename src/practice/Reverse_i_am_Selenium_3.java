package practice;


public class Reverse_i_am_Selenium_3 {

	public static void main(String[] args) {

		String str="I am Selenium";	 
		String s[]=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			String rev="";
			String s1=s[i];
			for (int j =s1.length()-1; j >=0 ; j--) {
				rev=rev+s1.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
