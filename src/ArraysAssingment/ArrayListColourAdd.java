package ArraysAssingment;

import java.util.ArrayList;

public class ArrayListColourAdd {

	public static void main(String[] args) {

		ArrayList<String> newString = new ArrayList<String>(); // creating ArrayList
		newString.add("White");
		newString.add("Red");
		newString.add("Black");
		newString.add("Blue");
		System.out.println(newString); // printing ArrayList
		for (String str : newString) // usig for-Each loop
		{
			System.out.println(str);
		}

	}

}
