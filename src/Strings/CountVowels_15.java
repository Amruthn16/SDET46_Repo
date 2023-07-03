package Strings;

public class CountVowels_15 {

	public static void main(String[] args) {
		
		String s="India"; //3
		String st=s.toLowerCase();
		
		//Using inbuilt indexOf method
		String v="AEIOUaeiou";
		int count = 0;
		
		for (int i = 0; i < st.length(); i++) {
			if(v.indexOf(st.charAt(i))!=-1) {
				System.out.print(st.charAt(i)+ " ");
				count++;
			}
		}
		System.out.println("\nNo of vowels present --> "+count);
		
		//without using indexOf method
		char[] ch=st.toCharArray();
		int counter=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				counter++;
				System.out.print(ch[i]+ " ");
			}
		}
		System.out.println();
		System.out.println("No of vowels present --> "+counter);
	}
}
