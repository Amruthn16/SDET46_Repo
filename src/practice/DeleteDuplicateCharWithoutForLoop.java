package practice;

public class DeleteDuplicateCharWithoutForLoop {

	static String s2="";

	public static String recurrusion(String st) {
		if(st.isEmpty()) {
			return st;
		}else {
			char ch=st.charAt(0);
			if(s2.indexOf(ch)==-1) {
				s2=s2+ch;
				return recurrusion(st.substring(1));
			}else {
				return recurrusion(st.substring(1));
			}
		}
	}

	public static void main(String[] args) {

		String st="java";
		recurrusion(st);
		System.out.print(s2);
	}
}
