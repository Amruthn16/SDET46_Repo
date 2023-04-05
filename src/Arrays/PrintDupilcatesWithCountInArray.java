package Arrays;

import java.util.LinkedHashSet;

public class PrintDupilcatesWithCountInArray {

	public static void main(String[] args) {

		int[] a= {2,4,4,6,5,6}; //o/p=> 4=2,6=2
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer num : set) { 
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(num==a[i]) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(num+" is repeating "+count+ " times");
			}
		}
	}
}
