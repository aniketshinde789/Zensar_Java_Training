package ArraysAssingment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrintkByUsingIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> myString=new ArrayList<Integer>();             //Integer type ArrayList
		myString.add(10);
		myString.add(100);
		myString.add(1000);
		myString.add(11111);
	
		Iterator<Integer>itr=myString.iterator();
		System.out.println("traversing element into forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}*/
		
			
		}
		

	


}
