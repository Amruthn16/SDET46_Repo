package Strings;

public class SumOFDigitInString_21 {

	public static void main(String[] args) {

		String st="1b2c5d"; //1+2+5=8
		int sum=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			
			if(ch>='0' && ch<='9') {
				int n=ch-48;//assci value of 0=48
				sum=sum+n; 
			}
		}
		System.out.println(sum);
	}

}
