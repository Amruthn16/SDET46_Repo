package HashMap_Prog;

import java.util.HashMap;

public class Sum_Of_Array_HashMap {

	public static void main(String[] args) {

		int[] ar = {2, 4, 7, 5, 9,6, 6};
		int targetSum = 12;
		boolean flag = false;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			int difference = targetSum - ar[i];
			if (map.containsKey(difference)) {
				Integer valueIndex = map.get(difference);
				flag=true;
					System.out.println("Pair found: " + ar[i] + "," + ar[valueIndex]);
					//break;
				}
			map.put(ar[i], i);
		}if(flag==false)
			System.out.println("No pair found with the given sum.");
	}
}

