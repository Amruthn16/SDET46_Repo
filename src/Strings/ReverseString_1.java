package Strings;

public class ReverseString_1 {

	public static void main(String[] args) {

		String st="Bangalore";
		
		//1st way --> using rev
		String rev=" ";
		for (int i = 0; i < st.length(); i++) {
			rev=st.charAt(i)+rev;
		}
		System.out.print(rev);
		
		System.out.println();

		//2nd way using for loop
		for (int i = st.length()-1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}
		
		System.out.println();
		
		//3rd way using char array
		char ch[] = st.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		//4th way using temp
		char cha[]=st.toCharArray();
		int i=0, j=st.length()-1;
		while(i<j) {
			char temp=ch[i];
			cha[i]=cha[j];
			cha[j]=temp;
			i++;
			j--;
		}
		String str=new String(cha);
		System.out.println(str);
		
		
		//5th way -->By using count variables
		char c[] = st.toCharArray();
		int count=0;
		for ( char d : c) {
			count++;
		}
		for (int i1 = count-1; i1 >= 0; i1--) {
			System.out.print(c[i1]);
		}
		
		System.out.println();
		
		//6th way --> StringBuffer
		StringBuffer sb= new StringBuffer(st);
		System.out.println(sb.reverse());
	}

}
