package com.conditional;
import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		
		char ch;
		Scanner alpha=new Scanner(System.in);
		ch=alpha.next().charAt(0);
		if(ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		

	}

}
