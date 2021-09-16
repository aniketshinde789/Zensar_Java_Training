package String;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		String text;
		int countwords=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		text=sc.nextLine();
		
		for(int i=0;i<text.length()-1;i++)
		{
			if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
				countwords++;
		}
		System.out.println("Total number of words in string are:"+ (countwords+1));
		

	}

}
