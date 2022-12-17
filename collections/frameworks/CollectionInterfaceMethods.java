package collections.frameworks;

import java.util.ArrayList;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ram");
		al.add(1,'g');
		al.add(120);
		System.out.println("Arraylist elements are: "+al);
		ArrayList lp=new ArrayList();
		lp.add("hari");
		lp.add(3000);
		al.addAll(lp);
		System.out.println("Arraylist elements are: "+al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
				
		
		
	}
}
