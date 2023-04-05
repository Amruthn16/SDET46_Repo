package patterns;

public class PatternAssign_16 {

	public static void main(String[] args) {

		int n=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(n+" ");
				n++;
				if(n==9) {
					n=1;
				}
			}
			System.out.println();

		}

	}

}
