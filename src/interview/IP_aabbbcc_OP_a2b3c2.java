package interview;

public class IP_aabbbcc_OP_a2b3c2 {

	public static void main(String[] args) {

		//input aabbbcccc  o/p a2b3c4

		String str="aabbbcccc";
		int count=0;
		for (int i = 0; i < str.length() ; i=i+count) {
			count=1;
			for (int j = i+1 ; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count=count+1;
				}else {
					break;
				}
			}
			System.out.print(str.charAt(i)+ "" +count);
		}
	}
}
