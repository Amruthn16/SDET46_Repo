package Arrays;

import java.util.LinkedHashSet;

public class OccuranceOfEachDigit {

	public static void main(String[] args) {

		int[] a= {2,4,4,6,5,6}; //o/p=> 2=1,4=2,6=2,5=1
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);        //2,4,6,5
		}
		for (Integer num : set) { 
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(num==a[i]) {
					count++;
				}
			}
			System.out.println(num+" is repeating "+count+ " times");
		}
	}
}
