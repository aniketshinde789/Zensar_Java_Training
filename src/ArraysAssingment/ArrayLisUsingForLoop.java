package ArraysAssingment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayLisUsingForLoop {

	public static void main(String[] args) {

		int element;
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);

		for (int i = 0; i < values.size(); i++) // using for loop
		{
			System.out.println(values.get(i));

		}

	}

}
