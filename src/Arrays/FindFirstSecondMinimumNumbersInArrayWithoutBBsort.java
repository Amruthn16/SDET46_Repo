package Arrays;

public class FindFirstSecondMinimumNumbersInArrayWithoutBBsort {

	public static void main(String[] args) {
		int[] a= {1,3,7,1,5};

		int firstMin=a[0];
		int secondMin=a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i]<=firstMin) {
					
					if(a[i]!=firstMin) {
					secondMin=firstMin;
					}
					firstMin=a[i];
					
				}else if(firstMin==secondMin || a[i]<secondMin) {
					secondMin=a[i];
			}
		}
		System.out.println("First minimum number --> "+firstMin);
		System.out.println("Second minimum number --> "+secondMin);
	}
}
