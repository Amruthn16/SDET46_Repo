package practice;

public class Practice {

	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		while(n>9) { //123t, 6f
			sum=0;
			while(n!=0) { //123t, 12t, 1t ,0f
				int d=n%10; //3, 2, 1
				sum=sum+d; //3, 5, 6
				n=n/10; //12, 1, 0
			}
			n=sum; //6
		}
		System.out.println(sum);
	}
}

//while(n>0 || sum>9) { //123t, 12t, 1t
//if(n==0) { //123f, 12f, 1f, 0t
//	n=sum; //6
//	sum=0; //0
//}
//int d=n%10; //3, 2 , 1, 6
//sum=sum+d;  //3, 3+2=5, 5+1=6; 6+6=12
//n=n/10; //12, 1, 0, 0
//}
