package Assignments;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccuranceOfEachDigitUsingMap_3 {

	public static void main(String[] args) {
		
		int[] a= {2,4,4,6,5,6}; //o/p=> 2=1,4=2,6=2,5=1
		LinkedHashMap<Integer, Integer> set= new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			set.put(1,a[i]);        //2,4,6,5
		}
		
		for ( Entry<Integer, Integer> num : set.entrySet()) { 
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(num==set.keySet()) {
					count++;
				}
			}
			System.out.println(num+" is repeating "+count+ " times");
		}
	}

}
