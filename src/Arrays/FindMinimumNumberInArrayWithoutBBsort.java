package Arrays;

public class FindMinimumNumberInArrayWithoutBBsort {

	public static void main(String[] args) {

		int[] a= {10,2,1,1,5};

		int firstMin=a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i]<firstMin) {
					firstMin=a[i];
				}
			}
		
		System.out.println("First minimum number --> "+firstMin);
	}

}
