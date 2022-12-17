package collections.frameworks;

import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorsetExample1 {
   public static void main(String[] args) {
	   ArrayList <String> name = new ArrayList<>();
	   name.add("Ravi");
	   name.add("Tina");
	   name.add("Payal");
	   name.add("Aashi");
       System.out.println("The list of the names of the students is given as: "+name);
       System.out.println("Before using the set() method : ");
       ListIterator<String> iterator = name.listIterator();
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }
       iterator.set("None");
       System.out.println("After using the set() method : ");
       for (String item : name) {
           System.out.println(item);
       }
   }
}
