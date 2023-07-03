package interview;

public class ConvertFirstCharToCapital {

	public static void main(String[] args) {

		String st= "my name is amruth";//a=97 A=65 0=45
		char ch[]=st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a'&& ch[i]<'z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&& ch[i]<'Z')
				ch[i]=(char) (ch[i]+32);
		}
		String cap=new String(ch);
		System.out.println(cap);
	}
}