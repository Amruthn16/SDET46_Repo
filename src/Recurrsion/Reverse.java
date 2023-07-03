package Recurrsion;

public class Reverse {
	static String rev="";
	public static void main(String[] args) {

		String st="amruth";

		String data = recurrsion(st, 0);
		System.out.println(data);
	}

	public static String recurrsion(String str, int i) {

		while(i<str.length()-1) {
			if ((str==null)||(str.length() <= 1))
				System.out.println(str);
			else{
				rev=str.charAt(i)+rev;
				recurrsion(str, i++);
			}
		}
		return rev;
	}
}
