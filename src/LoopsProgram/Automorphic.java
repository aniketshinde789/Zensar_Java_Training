package LoopsProgram;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		
		
		int number;
		int squ;
		
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		 squ=number*number;
		 
		 
			 if(number%10 ==squ%10)
			 {
				 System.out.println("It is a automorphic number");
			 }
			 else
			 {
				 System.out.println("It is not automorphic number");int square=number*number;
			 }
		 

	}

}
