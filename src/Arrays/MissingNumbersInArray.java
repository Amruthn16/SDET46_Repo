package Arrays;

import java.util.LinkedHashSet;

public class MissingNumbersInArray {

	public static void main(String[] args) {

		int [] a= {1,4,6,8,10}; //2,3,5,7,9
		
		
		for (int i = 1; i <=10; i++) {
			boolean flag = true;
			for (int j = 0; j <a.length; j++) {
				if(i==a[j]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(i+" ");
			}
		}
		
//		LinkedHashSet<Integer>set = new LinkedHashSet<>();
//		
//		for (int i = 0; i < a.length; i++) {
//				set.add(a[i]);
//			}
//		for (int i=1; i<=10; i++) {
//			if(!set.contains(i)) {
//				System.out.print(i+" ");
//			}
//		}
	}
}
