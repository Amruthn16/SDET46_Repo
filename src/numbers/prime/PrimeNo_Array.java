package numbers.prime;

public class PrimeNo_Array {

	public static void main(String[] args) {

		int []arr= {1,5,3,6,7,6,8,27,19};
		

		for (int i = 0; i <arr.length; i++) {
			int no=arr[i];
			int count=0;
			for (int j = 1; j<=no; j++) {
				if(no%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(no+" ");
			}
		}
	}
}
