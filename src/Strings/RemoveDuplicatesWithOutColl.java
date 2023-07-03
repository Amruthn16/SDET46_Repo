package Strings;

public class RemoveDuplicatesWithOutColl {

	public static void main(String[] args) {

		String st= "java selenium Api java Api java";
		String[] str = st.split(" ");

		for (int i = 0; i < str.length; i++) {
			 boolean flag = false;
			for (int j = i+1; j < str.length; j++) {
				if(str[i].equals(str[j])) {
				flag=true;
				}
			}
			if(flag==false) {
				System.out.print(str[i]+" ");
			}
		}
	}
}
