package interview;

public class AddDiagonalMatrix {

	public static void main(String[] args) {

		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		int sum1=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <=i; j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
			for (int j = a.length-1; j >=i; j--) {
				if(i==j) {
					sum1=sum1+a[i][j];
				}
			}
		}
		System.out.println(sum-sum1);


	}
}
