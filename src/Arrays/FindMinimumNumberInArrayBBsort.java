package Arrays;

public class FindMinimumNumberInArrayBBsort {

	public static void main(String[] args) {

		int[] a= {1,0,1,0,1,2,3};

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>=a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		System.out.println("First minimum number --> "+a[0]);
//		System.out.println("Second minimum number --> "+a[1]);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
