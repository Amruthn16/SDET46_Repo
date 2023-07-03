package Arrays;

import java.util.LinkedHashSet;

public class RemoveDupicateInArray {

	public static void main(String[] args) {

		int[] a= {2,4,4,6,5,6}; //2,4,6,5
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
//			set.add(a[i]);
			if(set.add(a[i])==true) {
				System.out.print(a[i]+ " ");
			}
		}
//		for (Integer num : set) {
//			System.out.print(num+ " ");
//		}
	}
}
