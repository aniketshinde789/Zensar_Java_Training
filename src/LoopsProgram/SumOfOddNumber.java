package LoopsProgram;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		
		int index,i,sum=0;
		Scanner sc=new Scanner(System.in);
		index=sc.nextInt();
		for(i=1;i<=index;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of odd number" +sum);
	}

}
