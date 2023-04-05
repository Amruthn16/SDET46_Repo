package Arrays;

public class FindMinimumNumberInArrayBBsort {

	public static void main(String[] args) {

		int[] a= {7,2,1,0,5};

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>=a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("First minimum number --> "+a[0]);
		System.out.println("Second minimum number --> "+a[1]);

	}

}
