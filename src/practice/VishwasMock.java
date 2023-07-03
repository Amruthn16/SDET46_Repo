package practice;

public class VishwasMock {

	public static void main(String[] args) {

		String st="my name is amruth and last name is ab"; //count, remove, reverse--> a
	
		int count=0;
		String[] words = st.split(" ");
		for (int i = words.length-1; i>=0 ; i--) {
			String str=words[i];

			for (int j =str.length()-1; j>=0; j--) {
				if(str.charAt(j)=='a') {
					count++;
				}else {
					System.out.print(str.charAt(j));
				}
			}
			System.out.print(" ");
		}
		System.out.println("\n"+count);
	}
}

