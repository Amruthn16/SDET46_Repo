package patterns;

public class Pattern_4 {

	public static void main(String[] args) {
//      Increase ==> 1
//	    Decrease ==> i
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 

		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = i; j<n; j++) //decreasing space
			{
				System.out.print("  "); //double space
			}
			for (int j = 1; j<=i; j++) //increasing star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
