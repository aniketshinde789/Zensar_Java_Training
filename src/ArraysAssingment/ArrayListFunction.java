package ArraysAssingment;

import java.util.ArrayList;

public class ArrayListFunction {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();    //ArrayList
		ArrayList<String> list2=new ArrayList<String>();
		list1.add("John");
		list1.add("Ram");
		list1.add("Sham");
		list1.add("Vikram");
		list2.add("Rohit");
		list2.add("Mandar");
		
		System.out.println(list1);
		System.out.println(list2);
		list1.add("Raju");               //Using add function
		
		System.out.println(list1);

		System.out.println( "Size of the ArrayList "+list1.size());        //Size of the ArrayList
		System.out.println("index of particular element "+list1.indexOf("Sham"));          //Checking index of particular element 
		
		System.out.println(list1.addAll(list2));         //using addAll function to combine ArrayList
		System.out.println(list1);
		
		System.out.println(list2.retainAll(list1));
		System.out.println(list2);
		
		System.out.println(list1.contains("Ram"));
		System.out.println(list2.removeAll(list2));          //removeAll function use because deleted all element
		System.out.println(list2.isEmpty());                 // Checking ArrayList isEmpty or not 
		
		
		
		
		

	}

}
