package interview;

public class Pipepine_program {

	public static void main(String[] args) {

		String st= "my||name||is||amruth";
//		String str = st.replace("||", " ");
//		System.out.println(str);
		String[] s = st.split("\\|\\|");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
	}
}
