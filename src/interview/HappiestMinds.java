package interview;

public class HappiestMinds {

	public static void main(String[] args) {

		String st="manu keerthi akshay amruth adrash abhi";
		
//		int count=0;
//		if(!(" ".equals(st.substring(0, 1))) || !(" ".equals(st.substring(st.length()-1))) ) {
//			for (int i = 0; i < st.length(); i++) {
//				if(st.charAt(i)==' ' ) {
//					count++;
//				}
//			}
//			count++;
//		}
//		System.out.println(count);
		
		int count=0;
		for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i)==' ' && st.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
