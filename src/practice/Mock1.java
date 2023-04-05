package practice;

public class Mock1 {

	public static void main(String[] args) {

		String st = "a11b22c33";
		int sum=0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch>='0' && ch<='9') {
				int n=ch-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
