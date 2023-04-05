package interview;

public class FreqOfOddEvenInMatrix {

	public static void main(String[] args) {
		//Write a java to get the frequency of odd and even numbers in the given matrix
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int ec=0,oc=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]%2==0) {
					ec++;	
				}else {
					oc++;
				}
			}
		}
		System.out.println("Even nos: "+ec);
		System.out.println("Odd nos: "+oc);
	}
}
