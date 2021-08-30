package com.conditional;
import java.util.Scanner;

public class PositiveNegativeNum {

	public static void main(String[] args) {
		int Number;
		Scanner sc=new Scanner(System.in);
		Number=sc.nextInt();
		if(Number>0)
		{
			System.out.println("Number is Positive");
		}
		 else if(Number<0)
		{
			System.out.println("Number is Negative");
			
		}
		 else
		 {
			 System.out.println("Number is Zero");
		 }

	}

}
