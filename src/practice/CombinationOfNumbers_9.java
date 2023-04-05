package practice;

public class CombinationOfNumbers_9 {

	public static void main(String[] args) {

		int a[]= {1,3,5,2,8,9,10};

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==11) {
					System.out.println("Combination nos is "+a[i]+"+"+a[j]+"=11");
				}
			}
		}
	}
}
