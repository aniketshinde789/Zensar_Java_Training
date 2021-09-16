package LoopsProgram;

import java.util.Scanner;

public class Printtable {

	public static void main(String[] args) {
		
		int number,i;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(number+ "*" +i+ "=" +number*i);
		}
		

	}

}
