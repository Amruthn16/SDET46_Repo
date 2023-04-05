package Arrays;

public class PositionOfEachDigitWithDuplicates {

	public static void main(String[] args) {

		int[] a= {2,4,4,6,5,6}; 
		
		for (int i = 0; i < a.length; i++) {
			System.out.println( a[i]+ " is in "+ (i+1) +" position");
		}
	}
}
