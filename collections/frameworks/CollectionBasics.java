package collections.frameworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CollectionBasics {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// arraylist
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("hello");
		al.add(2, 'c');
		System.out.println(al);
		System.out.println("--------------------------------------");
		// HashSet
		HashSet<String> hs = new HashSet<String>();
		hs.add("bolo");
		hs.add("na");
		System.out.println(hs);
		System.out.println("--------------------------------------");
		// LinkedList
		List<String> l = new LinkedList<String>();
		l.add("list");
		l.add("ant");
		System.out.println(l);
		System.out.println("--------------------------------------");
		// hasmap
		HashMap hm = new HashMap();
		hm.put("id", 101);
		hm.put("id", 102);
		hm.put("id", 103);
		System.out.println(hm);

	}

}
