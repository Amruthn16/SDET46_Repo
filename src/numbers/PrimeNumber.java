package numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=2;
		int count=0;
		for (int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(n+ " is prime number");
			}else {
				System.out.println(n+ " is not a prime number");
			}		
		
		
		
//2nd way ==============================
		
//		int n=0;
//		boolean flag = true;
//		
//		if(n==0||n==1) {
//			flag=false;
//		}else {
//			for(int i=2; i<=n; i++) {
//				if(n%i==0 ) {
//					flag=false;
//					break;
//				}
//			}
//		}
//		
//		if(flag==true) {
//			System.out.println("prime number");
//		}else {
//			System.out.println("not a prime number");
//		}


	}
}
