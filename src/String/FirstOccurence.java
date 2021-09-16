package String;

import java.util.Scanner;

public class FirstOccurence {

	public static void main(String[] args) {
		String firstchar;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		firstchar=sc.nextLine();
		System.out.println("Enter the character to find :");
		ch=sc.next().charAt(0);
		int x=firstchar.indexOf(ch);
		System.out.format("\nThe first character occurence ",x);

	}

}
