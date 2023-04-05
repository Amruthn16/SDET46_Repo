package numbers;

public class FindPrimeNumber0to20 {

	public static void main(String[] args) {
		
		
		int n=20;
		for (int i=0; i<=n; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {

				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+ " ");
			}
		}

		//2nd way
		//		for (int i = 0; i <=20; i++) {
		//
		//			int n=i; 
		//			int j=2; 
		//			while(j<=n) { 
		//				if(n%j==0) {
		//					break;
		//				}else {
		//					j++;
		//				}
		//			}
		//			
		//			if(j==n) {
		//				System.out.print(n+ " ");
		//			}
		//		}
	}
}
