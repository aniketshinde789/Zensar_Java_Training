package ArraysAssingment;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListReverse {

	public static void main(String[] args) {
		
		ArrayList<String> newString=new ArrayList<String>();
		newString.add("Rohit");
		newString.add("Kaml");
		newString.add("Neha");
		
		ListIterator<String> itr=newString.listIterator();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}
