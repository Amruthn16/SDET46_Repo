package numbers;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Occurence_Of_Number {

	public static void main(String[] args) {

		int n = 1000;
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		while (n!=0) {
			int d = n%10;
			list.add(d);
			n=n/10;
		}
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (Integer no : list) {
			set.add(no); 
		}
		
		for (Integer num : set) {
			int count=0;
			for (int i = 0; i < list.size(); i++) {
				if(num==list.get(i)) {
					count++;
				}
			}
			System.out.println(num+"="+count);
		}
	}
}
