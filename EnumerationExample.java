package collections.frameworks;

import java.util.Enumeration;
import java.util.Vector;

//Enumeration cursor can be used only with Legacy Class i.e Vector & Stack
public class EnumerationExample {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("hari");
		v.add("ram");
		v.add("krishna");
		System.out.println(v);
		
		//enumeration
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
