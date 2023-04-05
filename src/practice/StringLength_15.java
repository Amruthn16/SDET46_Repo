package practice;

public class StringLength_15 {

	public static void main(String[] args) {

		String str = "Amruth";
		int i = 0;
		for(char ch: str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string is "+i);
	}
}

