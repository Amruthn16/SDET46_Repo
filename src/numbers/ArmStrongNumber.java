package numbers;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n=153;
		int sum=0;
		int dc=countDigits(n);
		do {
			int d=n%10;
			sum=sum+ power(d,dc);
			n=n/10;
		}while(n!=0);
		
		if(sum==n) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}
	}

	private static int power(int n, int p) {
		int power=1;
		for (int j = 1; j <=p; j++) {
			power=power*n;
		}
		return power;
		
	}

	private static int countDigits(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}

}
