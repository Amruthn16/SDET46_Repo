package interview;

import java.util.LinkedHashSet;

public class MangoApple {

	public static void main(String[] args) {

		String a[] = {"mango", "mango", "apple", "apple","banana", "grapes" };//mango, apple

		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++) {
			int count=1;
			if(set.add(a[i])==false){
				count++;
				System.out.println(a[i]+" "+count);
				
			}
			
		}

	}
}

