package numbers;

public class FibonnaciSeries {

	static int fib1=0;  //0 1 1 2 3 5 8 13 21 34 55 89 144
	static int fib2=1;
	static int fib3;
	public static void main(String[] args) {

//		int fib1=0;  //0 1 1 2 3 5 8 13 21 34 55 89 144
//		int fib2=1;
//		int fib3;
//		System.out.print(fib1+" "+fib2+" ");
//
//		for (int i = 0; i <=10; i++) {
//			
//			fib3=fib1+fib2;
//			fib1=fib2;
//			fib2=fib3;
			
			
			//======================
//			if(fib3%3==0 || fib3%5==0) {
//				System.out.print(fib3+" ");
//			}
//	}
			//============================
			
		
		System.out.print(fib1+" "+fib2);
		recurrsion(1);
	}

	public static void recurrsion(int i) {

		if(i<10) {
			fib3=fib1+fib2;
			System.out.print(" "+fib3);

			fib1=fib2;
			fib2=fib3;
			i++;
			recurrsion(i);
		}
	}
}
