package Arrays;

public class FindFirstSecondMaximumNumbersInArrayWithoutBBsort {

	public static void main(String[] args) {
		int[] a= {0,3,7,1,5};

		int firstMax=a[0];
		int secondMax=a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i]>=firstMax) {
					
					if(a[i]!=firstMax) {
						secondMax=firstMax;
					}
					firstMax=a[i];
					
				}else if(firstMax==secondMax || a[i]>secondMax) {
					secondMax=a[i];
			}
		}
		System.out.println("First maximum number --> "+firstMax);
		System.out.println("Second maximum number --> "+secondMax);
		
	}

}
