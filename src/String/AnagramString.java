package String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		str1=sc.nextLine();
		System.out.println("Enter second string");
		str2=sc.nextLine();
		str1=str1.toLowerCase();    //Converting both the string to lower case.
		str2=str2.toLowerCase();
		
		int length1=str1.length();   //Checking length of the string.
		int length2=str2.length();
		if(length1==length2)
		{
			System.out.println("Both the strings are anagram.");
		}
		else
		{
			char[] string1=str1.toCharArray();     //Converting both the arrays to character array.
			char[] string2=str2.toCharArray();
			
			Arrays.sort(string1);      //Sorting the arrays using in-buit function sort()
			Arrays.sort(string2);
			
			if(Arrays.equals(string1,string2)==true)   //Comparing both the arrays using in-built function equals()
			{
				System.out.println("Both the string are anagram");
			}
			else
			{
				System.out.println("Both the string are not anagram");
			}
			
		}
				
	}

}
