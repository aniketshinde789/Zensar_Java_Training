package ArraysAssingment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UsingIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aniket");
		list.add("Rohan");
		list.add("Vikram");
		list.add("Sham");
		list.add(2,"Ram");
		ListIterator<String> itr=list.listIterator();
		System.out.println("traversing elements in fordward direction...");
		while(itr.hasNext())                 //using hasNext method
		{
			System.out.println(itr.next());
		}
		System.out.println("traversing elements in backward direction....");
		while(itr.hasPrevious())                     //using hasPrevious method
		{
			System.out.println(itr.previous());
		}
		/*
		 * for(String str:list) //using for-each loop { System.out.println(str); }
		 */

	}

}
