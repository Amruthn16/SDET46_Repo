package numbers.prime;


public class AlternativePrimeNo {

	public static void main(String[] args) {

		int n=100;
		int counter = 1;
		for (int i = 1; i <=n; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
			}

			if(count==2) {
				counter++;
			}
			if(counter%2==0) {
				if(count==2) {
					System.out.print(i+" ");
				}
			}
		}
	}
}

