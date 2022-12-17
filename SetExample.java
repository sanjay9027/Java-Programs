package collections.frameworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add("muna");
	s.add(989);
	s.add("lofi");
	s.add(10);
	System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
