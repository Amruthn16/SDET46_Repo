package practice;

public class Demo {

	public static void main(String[] args) {
				  //0123456789
		String str="aabbbcaabbaaac";
		int count=0;
		for (int i = 0; i < str.length() ; i=i+count) {//1, 1+2=3
			count=1;
			for (int j = i+1 ; j < str.length(); j++) {//1, 2
				if(str.charAt(i) == str.charAt(j)) {
					count++;//2
				}else {
					break;
				}
			}
			System.out.print(str.charAt(i)+ "" +count);
		}
	}
}
