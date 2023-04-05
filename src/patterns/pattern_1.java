package patterns;

public class pattern_1 {

	public static void main(String[] args) {
		
//		* * * * *         Increase ==> i
//		* * * * *		  Decrease ==> 1
//		* * * * *
//		* * * * * 

		int n=5;
		for (int i = 1; i <=n; i++)  //row
		{
			for (int j = 1; j <=n; j++) //col
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
