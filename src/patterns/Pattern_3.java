package patterns;

public class Pattern_3 {

	public static void main(String[] args) {
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		*
		
		int n=5;
		for (int i = 1; i<=n; i++)
		{
//			for(int j=n; j>=i; j--)
			for (int j=i; j<=n; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
