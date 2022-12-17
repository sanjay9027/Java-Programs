package collections.frameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList languages = new ArrayList<>();

		// Add elements in the list
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		System.out.println("ArrayList: " + languages);

		// Create a new array of String type
		String[] arr = new String[languages.size()];

		// Convert ArrayList into the string array
		languages.toArray(arr);
		System.out.print("Array: ");
		for (String item : arr) {
			System.out.print(item + ", ");
		}
		System.out.println("");
		// convert array to list
		List lang = new ArrayList<>(Arrays.asList(arr));

		System.out.println("List: " + lang);
	}
}
