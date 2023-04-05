package Strings;

import java.util.Scanner;

public class CountUpperAndLowerCase_14 {

	public static void main(String[] args) {

		for(;;) {

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the String");
			String st = sc.next();
			//String st = "TestYantra";
			int uppercase=0;
			int lowercase=0;

			for (int i = 0; i < st.length(); i++) {
				if(st.charAt(i)>='A' && st.charAt(i)<='Z') {
					uppercase++;
				}else if(st.charAt(i)>='a' && st.charAt(i)<='z') {
					lowercase++;
				}
			}
			System.out.println("No of uppercases --> "+uppercase);
			System.out.println("No of lowercases --> "+lowercase);

		}
	}
}
