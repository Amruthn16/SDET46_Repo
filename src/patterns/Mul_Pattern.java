package patterns;

public class Mul_Pattern {

	public static void main(String[] args) {

		int n=3;
		int triangle=3;
		int no=1;

		for (int k = 1; k <=triangle; k++) {
			for (int i = 1; i <=n; i++) {
				for (int j = i; j <n; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j<=i; j++) {

					System.out.print(no+++" ");	
				}
				System.out.println();
			}
		}
	}
}
