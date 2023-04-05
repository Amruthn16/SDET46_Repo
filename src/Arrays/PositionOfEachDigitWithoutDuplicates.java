package Arrays;

import java.util.LinkedHashSet;

public class PositionOfEachDigitWithoutDuplicates {

	public static void main(String[] args) {

		int[] a= {2,4,4,6,5,6}; 
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
//			set.add(a[i]);
			if(set.add(a[i])==true){
			System.out.println( a[i]+ " is in "+ (i+1) +" position");
			}
		}
//		for (Integer num : set) { 
//			for (int i = 0; i < a.length; i++) {
//				if(num==a[i]) {
//					System.out.println( num+ " is in "+ (i+1) +" position");
//					break;
//				}
//			}
//		}
	}
}
