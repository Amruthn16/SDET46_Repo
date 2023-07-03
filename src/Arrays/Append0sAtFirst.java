package Arrays;

public class Append0sAtFirst {

	public static void main(String[] args) {

		int a[]= {0,1,0,0,1,1,3,5}; //o/p=> 0,0,0,1,1
		int[] b= new int[a.length];
		int m=0;
		int n=a.length-1; //4
		for(int i=0; i<a.length; i++){  //0,1,2,3,4,5<5f
			if(a[i]==0){   //0==0t , 1==0f, 0==0t, 0==0t, 1==0f
				b[m]=a[i];  //b[0]=0, b[1]=0, b[2]=0
				m++;   //1,2,3
			}else{
				b[n]=a[i]; //b[4]=1,b[3]=1
				n--; //3,2
			}
		}
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}		
	}
}
