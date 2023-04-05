package practice;

public class MoveArrayElementsByKey_16 {

	public static void main(String[] args) {

		int [] arr = {2, 4, 6, 8, 10, 12};
		
		int n = 2;
		
		for(int i = 0; i < n; i++){ 
			int j, firstElement;
			
			firstElement = arr[0]; 
			for(j = 0; j < arr.length-1; j++){ 
				arr[j] = arr[j+1]; 
			}
			arr[j] = firstElement; 
		}
		
		System.out.println("Array after "+n+" left rotations: ");
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

