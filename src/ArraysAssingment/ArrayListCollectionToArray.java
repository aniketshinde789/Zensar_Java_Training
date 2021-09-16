package ArraysAssingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollectionToArray {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		System.out.println(number);
		System.out.println("Convert collection to Array");

		Object[] objects = number.toArray();
		// printing array of objects
		for (Object obj : objects) {
			System.out.println(obj   +" ");
		}
		String[] list= {"ram","Sham","Geeta"};           //Array 
		
		
		
		System.out.println("Conversion of array  to ArrayList");           //conversion of Array to ArrayList
		List al=Arrays.asList(list);
		System.out.println(al);

	}

}
