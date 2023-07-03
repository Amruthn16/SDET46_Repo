package Arrays;

public class FindFirstSecondThirdMax {

	public static void main(String[] args) {
		int[] a= {9,0,5,1,3,6,9,4};
		int fmax=a[0], smax=a[0], tmax=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(fmax<a[i]) {
				fmax=a[i];
			}
		}
		int possible=0;
		
		for (int i = 0; i < a.length; i++) {
			if(smax<a[i]) {
				possible=a[i];
			}
			if(fmax>possible) {
				smax=possible;
			}
		}
		int possible1=0;
		
		for (int i = 0; i < a.length; i++) {
			if(tmax<a[i]) {
				possible1=a[i];
			}
			if(smax>possible1) {
				tmax=possible1;
			}
		}
		System.out.println(fmax+" "+smax+" "+tmax);
	}
}
