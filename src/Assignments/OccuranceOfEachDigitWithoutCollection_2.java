package Assignments;

public class OccuranceOfEachDigitWithoutCollection_2 {

	public static void main(String[] args) {

		int[] a= {2,4,4,6,5,6};

		int[] count = new int[100];
		int temp = 0;

		for(int i = 0; i < a.length; i++){
			temp = a[i];
			count[temp]++;
		}

		for(int i=1; i < count.length; i++){
			if(count[i] > 0 && count[i] == 1){
				System.out.println(i+" occurs "+count[i]+" time");
			}
			else if(count[i] >=2){
				System.out.println(i+" occurs "+count[i]+" times");
			}
		}
	}
}
