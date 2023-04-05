package Strings;

public class SortBasedOnFirstCharacter_20 {

	public static void main(String[] args) {
		
//		String a="hi";
//		String b="hii";
//		System.out.println(a.compareTo(b));

		String[] st= {"12", "1", "53", "4", "7345234"};
		String[] num= {"ba", "a", "hy", "g", "khfjhrkj"};
		
		for (int i = 0; i < st.length; i++) {
			
			for (int j = i+1; j < st.length; j++) {
				
				if(st[i].compareTo(st[j])<0) {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}
}
