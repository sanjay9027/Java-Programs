package collections.frameworks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	public static void main(String[] args) {

		// convert array to set
		String[] array = { "a", "b", "c" };
		Set<String> set = new HashSet<>(Arrays.asList(array));
		System.out.println("Set: " + set);

		// convert set to Array
		Set<String> set1 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		String[] array1 = new String[set1.size()];
		set1.toArray(array1);
		System.out.println("Array: " + Arrays.toString(array1));
	}
}
