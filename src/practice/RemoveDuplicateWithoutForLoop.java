package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateWithoutForLoop {

	static ArrayList<String> l= new ArrayList<String>();
	static int i=0;
	public static void main(String[] args) {
		l.add("Amruth");
		l.add("Amruth");
		l.add("Vishwas");
		l.add("Subhas");

		//System.out.println(l);
		get(i);
	}

	public static void get(int i) {
		//TreeSet<String> t= new 	TreeSet<String>();
		LinkedHashSet<String> t= new LinkedHashSet<String>(l);
//		if(i<l.size()) {
//		
//			t.add(l.get(i));
//			i++;
////			get(i);
//		}
		System.out.println(t);
	}

}
