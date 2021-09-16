package LoopsProgram;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		int index,i,sum=0;
		Scanner sc=new Scanner(System.in);
		index=sc.nextInt();
		for(i=1;i<=index;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of even number" +sum);

	}

}
