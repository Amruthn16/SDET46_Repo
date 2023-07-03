package Strings;

public class OccurenceOfEachCharWithoutCollection {

	public static void main(String[] args) {
		String st = "amruuth";
		int count[] = new int[128];
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			count[ch]++;
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0)
			System.out.println((char)i+ "---->" +count[i]);
		}
	}
}
