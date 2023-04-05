package patterns;

public class Pattern_12 {
	public static void main(String[] args) {
//	     1 
//	    2 2 
//	   3 3 3 
//	  4 4 4 4 
//	 5 5 5 5 5 
		
		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = i; j<n; j++) //increasing space
			{
				System.out.print(" "); //single space
			}
			for (int j = 1; j<=i; j++) //decreasing star
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
