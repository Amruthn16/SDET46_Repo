package practice;

public class VishwasMock1 {

	public static void main(String[] args) {

		String str = "a1bc1234@qw125";
		char[] ch = str.toCharArray();
		String rev="";
		int count = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				count++;
				rev=rev+ch[i];
			}else {
				count=0;
				rev="";
			}
			if(count>=4) {
				System.out.println(rev);
			}
		}
		
		
		
//		String str = "a1bc124@qw0125";
//		char[] ch = str.toCharArray();
//		
//		for (int i = 0; i <= str.length(); i++) {
//			String sub=str.substring(i, i+4);
//			if(sub.matches("\\d{4}")) {
//			
//				System.out.println(sub);
//				break;
//			}
//		}
	}
}

