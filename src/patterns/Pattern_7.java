package patterns;

public class Pattern_7 {

	public static void main(String[] args) {
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 

		int n=5;
		for (int i = 1; i <=n; i++) 
			{
				for (int j = 1; j<=n; j++) { 
					if(i<=j) {
						System.out.print("* ");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		
		//or
		
//		for (int i = n; i >0; i--) 
//		{
//			for (int j = n; j>=1; j--) { 
//				if(i>=j) {
//					System.out.print("* ");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		int x=5;
		for (int i = 1; i <=x ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
