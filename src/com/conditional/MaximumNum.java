package com.conditional;
import java.util.Scanner;

public class MaximumNum {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner no=new Scanner(System.in);
		a=no.nextInt();
		b=no.nextInt();
		c=no.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("a is maximum " + a);
			 
		 }
		 else if(b>c)
		 {
			 System.out.println("b is maximum" +b);
		 }
		 else
		 {
			 System.out.println("c is maximum");
		 }
		 
		 
		


	}

}
