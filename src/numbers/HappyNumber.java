package numbers;


public class HappyNumber {
	
	public static void main(String[] args) {

		int n = 19; //7,13,19
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+(d*d);
			n=n/10;
		}

		if(sum==1) {
			System.out.println(n+" is a Happy number");
		}
		else if(sum==4) {
			System.out.println(n+" is not a Happy number");
		}
	}
}
