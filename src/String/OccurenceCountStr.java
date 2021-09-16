package String;

import java.util.Scanner;

public class OccurenceCountStr {

	public static void main(String[] args) {
		int count=0;
		char ch;
		String input="Welcome in india";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		ch=sc.next().charAt(0);
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
			
			count++;
		}
		System.out.println("The char '"+ch+"' appears "+count+" times.");

	}

}
