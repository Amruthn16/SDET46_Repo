package numbers;


public class XylenAndPhloenNumber {
	
	public static void main(String[] args) {
								
		int n = 34326;			//34326,143,121
		int ed=0, md=0;
		int temp=n;
		while(temp!=0) {
			if(temp==n||temp<10) {
				ed=ed+temp%10;
			}else {
				md=md+temp%10;
			}
			temp=temp/10;
		}
		
		if(ed==md) {
			System.out.println(n+" is a Xylem number");
		}
		else {
			System.out.println(n+" is a Phloen number");
		}
	}
}
