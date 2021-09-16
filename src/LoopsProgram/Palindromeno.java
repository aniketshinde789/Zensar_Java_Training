package LoopsProgram;

import java.util.Scanner;

public class Palindromeno {

	public static void main(String[] args) {
	
		int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(num==sum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is  not  palindrome");
		}

	}

}
