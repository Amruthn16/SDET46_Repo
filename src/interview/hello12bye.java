package interview;

public class hello12bye {

	public static void main(String[] args) {
//		hello12bye In that 2 are digit number and 8 are alphabet How to get alphabets
		String st = "hello12bye";
		char[] ch = st.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				//System.out.print(ch[i]);
			}
			else {
				System.out.print(ch[i]);
			}
		}
	}
}
