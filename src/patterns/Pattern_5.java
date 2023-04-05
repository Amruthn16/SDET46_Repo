package patterns;

public class Pattern_5 {

	public static void main(String[] args) {
		//		* * * * * 
		//		  * * * * 
		//		    * * * 
		//		      * * 
		//		        * 

		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j<i; j++) //increasing space
			{
				System.out.print("  "); //double space
			}
			for (int j = i; j<=n; j++) // decreasing star
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

