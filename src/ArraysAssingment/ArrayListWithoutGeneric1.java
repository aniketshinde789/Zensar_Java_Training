package ArraysAssingment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithoutGeneric1 {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();        //Generic ArrayList
		list1.add(10);
		list1.add("Aniket");
		Iterator itr=list1.iterator();
		int count=0;
		while(itr.hasNext())
		{
			System.out.println(count++ +" "+itr.next());
			
		}
				

	}

}
