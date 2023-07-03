package Arrays;


public class Array_Unquie {

	public static void main(String[] args) {

		String [] a= {"abc", "adff", "aaasd", "hjyyyt"};

		for (int i = 0; i < a.length; i++) {
			String str=a[i];
			for (int j = 0; j < str.length(); j++) {
				boolean flag = false;
				for (int j2 = j+1; j2 < str.length(); j2++) {
					if(str.charAt(j)==str.charAt(j2)) {
						flag=true;
						break;
					}
				}
				if(flag==false) {
					System.out.print(str.charAt(j));
				}
			}System.out.print(" ");
		}
	}
}