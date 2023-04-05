package practice;

public class SortArrayWithoutBubbleSort_2 {

	public static void main(String[] args) {

		int[] a= {7,-3,0,2,1,-9};

		for(int i = 1; i < a.length; i++){ 
			int keyValue = a[i]; 
			int j = i-1;

			while(j >= 0 && a[j] > keyValue){ 
				a[j+1] = a[j]; 
				j = j-1; 
			}
			a[j+1]=keyValue; 
		}
		
		//printing descending order
		for (int i = a.length-1; i >=0  ; i--) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		//print product
		int product=1;
		for (int i = a.length-1; i >= a.length-3 ; i--) {
			product=product*a[i];
		}
		System.out.print("product of first 3 maximum nos--> "+product);

	}

}

