package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTopic {

	public static void main(String[] args) {
		System.out.println("=============>Hashtable<==============");
		Hashtable<Integer, String> table= new Hashtable<Integer, String>();
//		table.put(null, "Amruth");// not allowed
//		table.put(50, null);// not allowed
		table.put(10, "welcome");
		table.put(50,"hi");
		table.put(50,"hello");//duplicate key is not allowed
		table.put(60, "bye"); // duplicate value is allowed
		System.out.println(table);
		System.out.println();

		System.out.println("=============>HashMap<==============");

		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(null, "Amruth");//null key is allowed
		map.put(20, null);
		map.put(10, "welcome");
		map.put(50,"hi");
		map.put(50,"hello");//duplicate key is not allowed
		map.put(60, "bye"); // duplicate value is allowed
		System.out.println(map);
		System.out.println("==========================================");

		//for each usage in map
		for ( Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		System.out.println("=================map=========================");
		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue("Amruth"));
		System.out.println("size " + map.size());
		System.out.println(map.replace(60, "tata bye"));
		System.out.println(map.remove(50));
		System.out.println(map);
		System.out.println();

		System.out.println("=============>LinkedHashMap<==============");

		LinkedHashMap<Integer, String> link= new LinkedHashMap<Integer, String>();
		link.put(null, "Amruth");
		link.put(null, "linked");//only one null key is allowed
		link.put(20, null);
		link.put(10, "welcome");
		link.put(50,"hi");
		link.put(30, "bye");
		link.put(50,"hello");//duplicate key is not allowed
		link.put(60, "bye"); // duplicate value is allowed
		System.out.println(link);
		System.out.println();
		System.out.println("=============>LinkedHashMap<==============");

		TreeMap<Integer, String> tree= new TreeMap<Integer, String>();
//		tree.put(null, "Amruth"); //null keys are not allowed
		tree.put(20, null);
		tree.put(10, "welcome");
		tree.put(50,"hi");
		link.put(30, "bye");
		tree.put(50,"hello");//duplicate key is not allowed
		tree.put(60, "bye"); // duplicate value is not allowed
		System.out.println(tree);
		System.out.println(tree.descendingKeySet());
	}

}
