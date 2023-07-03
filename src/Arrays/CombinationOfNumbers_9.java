package Arrays;

public class CombinationOfNumbers_9 {

	public static void main(String[] args) {

		int[] a= {1,5,3,8,1,0,6};
		
		int sum=9;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]+a[j]==sum) {
					if(j<i) {
						break;
					}else {
						System.out.println(a[i]+" + "+a[j]+" = "+sum);
					}
				}
			}
		}
	}
}