package TwoDimensionArray;

public class Merge2Array {

	public static void main(String[] args) {

		String[][] arr = {{"a", "b", "c", "d", "e", "h"}, {"1", "2", "3", "4","5"}};


		int i=0, j=0;
		while(i<arr[0].length && j<arr[1].length) {
			System.out.print(arr[0][i++]+arr[1][j++]+" ");
		}
		while(i<arr[0].length) {
			System.out.print(arr[0][i++]);
		}
		while(j<arr[1].length) {
			System.out.print(arr[1][j++]);
		}
	}
}
