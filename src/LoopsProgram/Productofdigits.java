package LoopsProgram;

import java.util.Scanner;

public class Productofdigits {

	public static void main(String[] args) {
		
		int number,rem,product=1;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number!=0)
		{
			rem=number%10;
			product=product*rem;
			number=number/10;
		}
		System.out.println("The product of number :"+product);
		
		

	}

}
