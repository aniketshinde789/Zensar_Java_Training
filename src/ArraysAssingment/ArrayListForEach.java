package ArraysAssingment;

import java.util.ArrayList;

public class ArrayListForEach {

	public static void main(String[] args) {
		
		ArrayList<String> myString=new ArrayList<String>();
		myString.add("Vikram");
		myString.add("Ram");
		myString.add("Rohit");
		myString.add("Sham");
		
		for(String str:myString)
		{
			System.out.println(str);
		}
		
	}

}
