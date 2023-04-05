package patterns;

public class Pattern_18 {

	public static void main(String[] args) {
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
		
		int n=5;
		for (int i = 1; i <=n; i++) 
		{
			char ch='A';
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
