package practice;

public class SumOFTwoDigits {

	public static void main(String[] args) {

		String st="11b10c5";
		String[] s = st.split("[a-z]+");
		int sum=0;
		for (int i = 0; i < s.length; i++) {
			int n= Integer.parseInt(s[i]);
			sum=sum+n;
		}
		System.out.println(sum);
	}
}
