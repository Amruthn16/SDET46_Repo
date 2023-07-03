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

		
		//without using collection
		int[] arr = {1, 2, 3, 1, 2, 1, 4, 5, 4, 3};
		int[] freq = new int[arr.length];
		int visited = -1;
		for(int i = 0; i < arr.length; i++) {
			int count = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i] != visited)
				freq[i] = count;
		}
		System.out.println("Element\tFrequency");
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] != visited)
				System.out.println(arr[i] + "\t" + freq[i]);
		}
	}
}