package Arrays;

import java.util.LinkedHashSet;

public class MissingNumbersInArray {

	public static void main(String[] args) {

		int [] a= {7,4,6,8,10,16, 6,4 }; //5 9 11 12 13 14 15
		
		int Max=a[0];
		int Min=a[0];
		for (int i = 1; i < a.length; i++) {
				if(a[i]<Min) {
					Min=a[i];
					
				}else if(a[i]>Max) {
					Max=a[i];
				}
			}
		
		for (int i = Min; i <=Max; i++) {
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
