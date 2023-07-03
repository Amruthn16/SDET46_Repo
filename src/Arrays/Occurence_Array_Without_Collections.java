package Arrays;


public class Occurence_Array_Without_Collections {

	public static void main(String[] args) {
		
		int [] a= {1,1,5,2,6,4,1,2,2};

		for (int i = 0; i < a.length; i++) {			
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					if(j<i) {
						break;
					}
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(a[i]+" "+count);
			}
		}
	}
}




