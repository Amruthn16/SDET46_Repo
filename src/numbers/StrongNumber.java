package numbers;

public class StrongNumber {

	public static void main(String[] args) {
		int n=145;
		int sum=0;
		do {
			int d=n%10;
			sum=sum+ getFact(d);
			n=n/10;
		}while(n!=0);
		
		if(sum==n) {
			System.out.println("Strong Number");
		}else {
			System.out.println(" Not Strong Number");
		}
	}

	public static int getFact(int d) {
		int fact=1;
		for (int i=0; i <=d; i++) {
			fact=fact*i;
		}
		return fact;
	}

}
