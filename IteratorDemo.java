package collections.frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(900);
		al.add("hello");
		al.add('g');
		al.add(89);
		forwardTraverse(al);
		
		backwardtraverse(al);
	}

	public static void forwardTraverse(List al) {
		// used Iterator but list Iterator can also work here
//		Iterator itr = al.iterator();
		ListIterator itr = al.listIterator();
		
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("");
		//traverse backward when cursor at last index
		System.out.println("Traverse backward");
		System.out.println("has previous element? Ans:"+ itr.hasPrevious());
		while (itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
			
		}

	}

	public static void backwardtraverse(List al) {
		//here the cursor is at middle of 1st elemnet so it will return no result
		// used listIteraror
		System.out.println("");
		ListIterator itr = al.listIterator();
		System.out.println("has previous element? Ans:"+ itr.hasPrevious());
		
		while (itr.hasPrevious()) { //loop will not execute
			System.out.print(itr.previous());
			
		}
	}
}
