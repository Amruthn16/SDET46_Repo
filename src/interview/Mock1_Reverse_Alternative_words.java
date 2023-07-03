package interview;

public class Mock1_Reverse_Alternative_words {

	public static void main(String[] args) {
		
		String s = "i am java programming selenium api";
		
		String[] st = s.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			
			 if(i%2!=0) {
				 String str=st[i];
				for (int j =str.length()-1; j>=0; j--) {
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
			}else {
				System.out.print(st[i]+" ");
			}
		}
	}
}
