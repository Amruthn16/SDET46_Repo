  package patterns;

public class PatternAssign_15 {

	public static void main(String[] args) {

//			 1 
//	       1 2 1 
//	     1 2 3 2 1 
//	   1 2 3 4 3 2 1 
//	 1 2 3 4 5 4 3 2 1 
		
		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = i; j <n; j++) { //for print space
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++)  //for printing 1 to 5
			{
				System.out.print(j+" ");
			}
			for (int j = i-1; j >=1; j--) //for printing 5 to 1
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
