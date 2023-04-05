package Assignments;

public class SumOfFirst3MinimumNoInArrayWithoutBBsort_1 {

	public static void main(String[] args) {

		int[] a= {5,1,3,2,6,0}; 

		for(int i = 1; i < a.length; i++){ 
			int keyValue = a[i]; 
			int j = i-1;

			while(j >= 0 && a[j] > keyValue){ 
				a[j+1] = a[j]; 
				j = j-1; 
			}
			a[j+1]=keyValue; 
		}
		
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum= sum+a[i];
		}
		System.out.print("sum of first 3 minimun numbers ==> " +sum);

	}

}
