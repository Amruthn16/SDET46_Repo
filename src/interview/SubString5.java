package interview;


public class SubString5 {

	public static void main(String[] args) {
	// str="aababbabaabb" and output: aabbaabbaabb using substring method

		String str = "aababbabaabb";
		String a = str.substring(0,2);
		String b = str.substring(4, 6);
		
		for (int i = 0; i <3; i++) {
			System.out.print(a+b);
		}
	}
}
