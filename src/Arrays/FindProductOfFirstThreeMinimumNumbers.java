package Arrays;

public class FindProductOfFirstThreeMinimumNumbers {

	public static void main(String[] args) {
		int[] a= {7,2,3,9,5};

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>=a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int product=1;
		for (int i = 0; i < 3; i++) {
			product=product*a[i];
		}
		System.out.println("Product of first three minimum numbers --> "+product);

	}

}
