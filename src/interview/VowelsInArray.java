package interview;

public class VowelsInArray {

	public static void main(String[] args) {
		String[] a= {"root", "amruth", "james"};
		String v="aeiouAEIOU";
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			String str= a[i];
			for (int j = 0; j < str.length(); j++) {
				if((v.indexOf(str.charAt(j))!=-1)) {
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
	}
}
