package interview;

public class CheckWordIsPresentInString {

	public static void main(String[] args) {
		//check "test" is present is "testing" or not  
		String s1 = "testing";
		String s2 = "ing";
		int i,j=0; 
				for ( i = 0; i <=s1.length()-s2.length(); i++) { //i=0,1
					for (j = 0; j <s2.length(); j++) { //j=0,0
						if(s1.charAt(i+j)!=s2.charAt(j)) { //0+0=0!=0f,1!=0t
							break;
						}
					}
					if(j==s2.length()) { 
						System.out.println("Present");
						break;
					}
					}
				if(i>s1.length()-s2.length())
					System.out.println("Not present");
				}

//		char[] s1arr = s1.toCharArray();
//		char[] s2arr = s2.toCharArray();
//		for ( i = 0; i <=s1arr.length-s2arr.length; i++) { //4/0,
//			for (j = 0; j <s2arr.length; j++) { //2/0,1
//				if(s1arr[i+j]==s2arr[j]) {	//t==i,t==n,t==g
//					if(j==s2arr.length-1) { 
//						System.out.println("Present");
//					}else{
//						break;
//					}
//				}
//			}
//			System.out.println("Not Present");
//		}
//	}
}


