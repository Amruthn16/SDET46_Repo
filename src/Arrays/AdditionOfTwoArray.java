package Arrays;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int[] a= {2,4,1,5,5};
		int[] b= {3,2,4,1};  // o/p=> 2+3=5,4+2=6,1+4=5,5+1=6,6

		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}

		for (int i = 0; i <length; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				if(a.length<b.length) {
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);
				}
			}
		}
	}
}
