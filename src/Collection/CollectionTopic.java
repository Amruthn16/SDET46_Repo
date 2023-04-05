
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class CollectionTopic {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add("Amruth");
		list.add(5);
		list.add(40);
		System.out.println(list);
		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(40);
		list1.add(4);
		list1.add(30);
		list1.add(10);
		list1.add(60);
		Collections.sort(list1);
		list.addAll(list1);
		System.out.println(list);
		if(list.contains("hi")) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
		list.remove(4);
		
		for(Object allData: list) {
			System.out.print(allData+ " ");
		}
		
		System.out.println();
		
		Iterator<Object> it= list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		System.out.println("==========================================");

		
		PriorityQueue<Integer> q= new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(56);
		q.add(80);
		System.out.println(q.peek());//it will fetch topmost element and it will not remove that element
		System.out.println(q);
		System.out.println(q.poll());//it will fetch topmost element and it will remove that element
		System.out.println(q);
		
		System.out.println("==========================================");

		HashSet <Object> h= new HashSet<Object>();
		h.add(10);
		h.add(45);
		h.add("hi");
		h.add(10);//dupilcates are not allowed
		h.add(null);
		h.add(null);//only one null value can be added
		System.out.println(h);
		
		System.out.println("==========================================");
		
		LinkedHashSet<Object> l=new LinkedHashSet<Object>();
		l.add(10);
		l.add(45);
		l.add("hi");
		l.add(10);//dupilcates are not allowed
		l.add(null);
		l.add(null);//only one null value can be added
		System.out.println(l);	
		
		System.out.println("==========================================");

		TreeSet<Object> t= new TreeSet<Object>(); //only same type datas are allowed
		t.add(10);
		t.add(45);
		t.add(10);//dupilcates are not allowed
		t.add(56);
		t.add(89);
//		t.add(null);
		System.out.println(t);
		
		
		
		}
	}

