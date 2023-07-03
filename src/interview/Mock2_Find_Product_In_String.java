package interview;

public class Mock2_Find_Product_In_String {

	public static void main(String[] args) {

		//		to fi3215nd pro234duct for the num1212bers in1212ide th1212is str3245ing
		String s = "i a2m goi123ng hoii2";

		int number=0;
		int product=1; 
		boolean flag = false;
		for(int i=0; i<s.length(); i++) { 

			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				int n=ch-48;
				number=number*10+n;
				flag = true;
			}else {
				if(flag==true)
					product=product*number; 
					number=0;
					flag = false;
			}
		}
		if(flag==true) {
			product=product*number;
		}
		System.out.println(product);
	}
}
