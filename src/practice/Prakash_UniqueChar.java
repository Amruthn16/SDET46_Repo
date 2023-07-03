package practice;


public class Prakash_UniqueChar {
	public static void main(String [] args){
		
	
		int n=1;
		for (char alp = 'A'; alp <='Z'; alp++) {
			if(n<10) {
				System.out.print(alp +""+n+""+(char)(alp+58));
				for (int i= 0; i <=5; i++) {
					System.out.print((char)(alp+(32+i)));
				}
				n++;
			}else {
				break;
			}
			System.out.println(" ");
		}
		
		
		
		
//		char alp;
//		for (int i= 0; i <10; i++) {
//			for ( alp = 'A'; alp <='Z'; alp++) {
//				System.out.print(alp +""+i+""+(char)(alp+32)+""+(char)(alp+58));
//				i++;
//		}
//			System.out.print((char)(alp+(32+i)));
//			System.out.println(" ");
//		}
	}

}

