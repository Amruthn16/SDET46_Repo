package patterns;

public class PatternAssign_8 {

	public static void main(String[] args) {
		//	     * 
		//	    * * 
		//	   * * * 
		//	  * * * * 
		//	 * * * * * 
		//	  * * * * 
		//	   * * * 
		//	    * * 
		//	     * 

		int n=5;
		for (int i = 1; i <n; i++) 
		{
			for (int j = 1; j<=n-i; j++) //increasing space
			{
				System.out.print(" "); //single space
			}
			for (int j = 1; j<=i; j++) //decreasing star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
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
	}

}
