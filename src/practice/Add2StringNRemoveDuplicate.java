package practice;

import java.util.LinkedHashSet;

public class Add2StringNRemoveDuplicate {

	public static void main(String[] args) {

		//not done

		String s1="this is fun show"; //this is tv
		String s2= "fun tv show";

		String s3=s1+" "+s2;

		String[] w1 = s1.split(" ");
		String[] w2 = s2.split(" ");
		String[] w3 = s3.split(" ");

		LinkedHashSet<String> set= new LinkedHashSet<>();
		for (String num : set) { 
			int count=0;
			for (int i = 0; i < w3.length; i++) {
				if(num==w3[i]) {				
					count++;
					System.out.println( w3[i]+ " "+count);
				}
				System.out.println( w3[i]+ " "+count);
			}

			//		LinkedHashSet<String> set1= new LinkedHashSet<String>();
			//		for (int i = 0; i < w1.length; i++) {
			//			set1.add(w1[i]);
			//		}
			//		
			//		for(String str: set1){
			//			for (int i = 0; i < w2.length; i++) {
			//				if(str.contains(w2[i])==false) {
			//					
			//				}
			//				System.out.print(str+ " ");
			//			}
			//		}
			//		
			//		LinkedHashSet<String> set2= new LinkedHashSet<String>();
			//		for (int i = 0; i < w2.length; i++) {
			//			set2.add(w2[i]);
			//		}
			//		
			//		for(String str: set2){
			//			for (int i = 0; i < w1.length; i++) {
			//				if(str.equals(w1[i])) {
			//					//System.out.print(w1[i]+ " ");
			//				}
			//			}
			//		}


		}
	}
}



