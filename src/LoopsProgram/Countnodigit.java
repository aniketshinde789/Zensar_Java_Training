package LoopsProgram;

import java.util.Scanner;

public class Countnodigit {

	public static void main(String[] args) {
		
		int number,count=0;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number!=0)
		{
			number=number/10;
			count++;
			
		}
		System.out.println("Number of digits :: "+count);
		

	}

}
