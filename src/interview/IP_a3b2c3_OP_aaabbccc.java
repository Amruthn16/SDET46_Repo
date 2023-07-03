package interview;

public class IP_a3b2c3_OP_aaabbccc {

	public static void main(String[] args) {

		String st="a3b2c3a1b1c1";
		for (int i = 0; i < st.length(); i++) {
			int count=0;
			char ch = st.charAt(i);
			if(ch>='0' && ch<='9') {
				int times=ch-48;
				while(count<times) {
					System.out.print(st.charAt(i-1));
					count++;
				}
			}
		}
	}
}
