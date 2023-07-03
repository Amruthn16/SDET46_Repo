package interview;

public class PrintNameInPattern {

	public static void main(String[] args) {
//		a
//		am
//		amr
//		amru
//		amrut
//		amruth
		String str="amruth";
		//char[] st = str.toCharArray();
//		
//		for (int i = 0; i < st.length; i++) {
//		
//			for (int j = 0; j <=i; j++) {
//				System.out.print(st[j]);
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(str.charAt(i+j));
				}
			System.out.println();
			
		}
	}

}
