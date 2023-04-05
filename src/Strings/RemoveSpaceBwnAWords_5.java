package Strings;

public class RemoveSpaceBwnAWords_5 {

	public static void main(String[] args) {

		String st="I am from Bangalore"; //IamfromBangalore
		
		//using inbuilt method
		String withoutSpace = st.replace(" ", "");
		System.out.println(withoutSpace);
		
		//without using inbuilt method
		String[] s = st.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
}
