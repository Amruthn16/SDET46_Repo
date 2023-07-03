package Strings;

public class demo {

	
	public static void main(String[] args) {
		
		String[][] arr = {{"a", "b", "c", "d", "e"}, {"1", "2", "3", "4"}};

		int length=arr[0].length;
		if(length<arr[1].length){
			length=arr[1].length;
		}
		
		 	String[] a = arr[0];
			String[] b= arr[1];
		
		for (int i = 0; i <length ; i++) {
		 	
			try {
		         System.out.print(a[i]+""+b[i]+" ");
			}
			catch (Exception e) {
				try {
				System.out.print(b[i]);
				}
				catch (Exception e1) {
					System.out.print(a[i]);
				}
			}
		}
	}
}
