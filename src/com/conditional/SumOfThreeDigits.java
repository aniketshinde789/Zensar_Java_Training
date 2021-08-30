package com.conditional;
import java.util.Scanner;

public class SumOfThreeDigits {

	public static void main(String[] args) {


		int number,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		
		while(number>999)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
			
		}
		System.out.println("The digit of three no" + sum);


	}

}
