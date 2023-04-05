package patterns;

public class Pattern_6 {

	public static void main(String[] args) {
		//		 * 
		//	    * * 
		//	   * * * 
		//	  * * * * 
		//	 * * * * * 

		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = i; j<n; j++) //increasing space
			{
				System.out.print(" "); //single space
			}
			for (int j = 1; j<=i; j++) //decreasing star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//	        * 
//	      * * * 
//	    * * * * * 
//	  * * * * * * * 
//	* * * * * * * * * 
		
		int x=5;
		for (int i = 1; i <=x ; i++) {
			for (int j = 1; j <=x-i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


