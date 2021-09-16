package ArraysAssingment;

import java.util.ArrayList;

public class ArrayListProperties {

	public static void main(String[] args) {
	
		ArrayList<Integer>list=new ArrayList<Integer>();  //ArrayList with nlo size defined
		list.add(10);     //Adding element to ArrayList
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(2);  //remove element  from index 2
		System.out.println(list.size());
		
		System.out.println(list);
		list.set(1, 111);   //setting value of elemnet at index 1
		System.out.println(list);
		list.add(1,22);   //inserting element at index 1
		System.out.println(list);
		

	}

}
