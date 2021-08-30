package com.conditional;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println(number + "Is a Even No.");
		}
		else
		{
			System.out.println(number + "Is a Odd No.");
		}
	}

}
