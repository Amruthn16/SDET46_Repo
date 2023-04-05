package Strings;

public class SumOFNumbersInString_22 {

	public static void main(String[] args) {
		
		String st="a11b10c5"; //11+10+5=26
		int sum=0;//
		int totalSum=0; //11 
		for(int i=0; i<st.length(); i++) { 
			char ch=st.charAt(i); //1 1
			
			if(ch>='0' && ch<='9') {
				int n=ch-48;  //49-48=1 ,1
				totalSum=totalSum*10+n; //11, 10, 
			}else {
				sum=sum+totalSum; //11 
				totalSum=0;
			}
		}
		sum=sum+totalSum; 
		System.out.println(sum);
	}
}
