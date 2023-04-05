package Arrays;

public class FindMaximumNumberInArrayWithoutBBsort {

	public static void main(String[] args) {

		int[] a= {7,2,19,4,5};

		int firstMax=a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i]>firstMax) {
					firstMax=a[i];
				}
			}
		
		System.out.println("First maximum number --> "+firstMax);
	}

}
